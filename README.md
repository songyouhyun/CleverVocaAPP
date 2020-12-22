# CleverVocaApp

## API명세서

1. `POST /api/module`
    module을 생성합니다.
    - request
    ```json
    {
        "module_name": "string",
        "publisher": "string",
        "word": [
            {
            "word": "string",
            "mean": "문장"
            }
        ]
    }
    ```
    - response
    ```json
    {
        "module": {
            "module_name": "string",
            "publisher": "string",
            "module_id": 39,
            "created_at": "2020-12-22T15:52:18"
        },
        "word": [
            {
                "word": "string",
                "module_id": 39,
                "mean": "문장",
                "word_id": 25
            },
            {
                "word": "word",
                "module_id": 39,
                "mean": "단어",
                "word_id": 2
            }
        ]
    }
    ```

2. `GET /api/module/search?search={search}`
    모듈을 검색합니다, search에 아무것도 안넣으면 기본적으로 `""`
    - request
    ```json
    search : 검색할 값
    ```

    - response
    ```json
    [
        {
            "created_at": "2020-12-22T16:00:12",
            "module_name": "string",
            "publisher": "string",
            "module_id": 1
        }
    ]
    ```

3. `GET /api/module/{id}`
    모듈을 가져옵니다.
    - request
    ```json
    id : module_id
    ```

    - response
    ```json
    {
        "module": [
            {
                "created_at": "2020-12-22T16:00:12",
                "module_name": "string",
                "publisher": "string",
                "module_id": 1
            }
        ],
        "word": [
            {
                "word": "string",
                "module_id": 1,
                "mean": "문장",
                "word_id": 1
            },
            {
                "word": "word",
                "module_id": 1,
                "mean": "단어",
                "word_id": 2
            }
        ]
    }
    ```

