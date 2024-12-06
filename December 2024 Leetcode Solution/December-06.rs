use std::collections::HashSet;

impl Solution {
    pub fn max_count(banned: Vec<i32>, n: i32, max_sum: i32) -> i32 {
        let banned_set: HashSet<i32> = banned.into_iter().collect(); 
        let mut ans = 0;
        let mut sum = 0;

        for i in 1..=n {
            if banned_set.contains(&i) {
                continue;
            }

            if sum + i > max_sum {
                break;
            }

            sum += i;
            ans += 1;
        }

        ans
    }
}
