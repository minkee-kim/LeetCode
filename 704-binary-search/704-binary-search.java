class Solution {
    public int search(int[] nums, int target) {
            // 이진 탐색, 타겟 숫자를 찾아서 그 인덱스 번호를 반환, 만약 없으면 -1 반환
    // 시간 복잡도는 O(log n)

        int mid;
        int end = nums.length-1;
        int start = 0;

        // 1. 인덱스 중간 번호 값과 타겟 숫자 비교
        //2. 만약 타겟 값이 더 크다면 중간 번호~ 배열의 크기
        //3. 만약 타겟 값이 더 작다면 0번~ 중간번호
        //4. 타겟 값이 나올 때까지 반복

        while (start <= end) {
            mid = (start+end)/2;
            if (target > nums[mid]) {
                start = mid+1;

            } else if (target < nums[mid]) {
                end = mid-1;

            } else return mid;


        }
        return -1;
    }
}