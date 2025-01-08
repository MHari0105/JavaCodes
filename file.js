db.getCollection("po_tracing_workbench").updateMany(
    {
        "created_by" : "650186c73a15e72763879b22",
        "config_name" : "Garment V2",
        "po_tracing_launch_config_metadata.name" : "PO Tracing - GARMENTS",
        "po_metadata.name" : {
            $in : [
                "2140085-25", "2140086-25", "2140087-25", "2140088-25",
                "2140089-25", "2140090-25", "2140091-25", "2140092-25"
            ]
        },
        "seller_metadata.name" : "RIJA FASHIONS"
    },
    {
        $set: { status : "INACTIVE" }
    }
);

-------------------------------

db.getCollection("po_tracing_workbench").updateMany(
    {
        "created_by" : "650186c73a15e72763879b22",
        "config_name" : "Garment V2",
        "po_tracing_launch_config_metadata.name" : "PO Tracing - GARMENTS",
        "po_metadata.name" : {
            $in : [
                "2170081-25", "2170082-25", "2170083-25", "2170084-25", "2170085-25", "2170086-25",
                "2170087-25", "2170088-25", "2170089-25", "2170090-25", "2170091-25", "2170092-25",
                "2170093-25", "2170094-25", "2170095-25", "2170096-25", "2170097-25", "2170098-25",
                "2170099-25", "2170100-25", "2170101-25", "2170102-25", "2170103-25", "2170104-25",
                "2170105-25", "2170106-25", "2170107-25", "2170108-25", "2170109-25", "2170110-25",
                "2170111-25", "2170112-25", "2170113-25", "2170114-25", "2170115-25", "2170116-25",
                "2170117-25", "2170118-25", "2170119-25", "2170120-25", "2170121-25", "2170122-25",
                "2170123-25", "2170124-25", "2170125-25", "2170126-25", "2170127-25", "2170128-25",
                "2170129-25", "2170130-25", "2170131-25", "2170132-25", "2170133-25", "2170134-25",
                "2170135-25", "2170136-25", "2170137-25", "2170138-25", "2170139-25", "2170140-25",
                "2170141-25", "2170143-25", "2170144-25", "2170146-25"
            ]
        },
        "seller_metadata.name" : "BALTIMORE BD"
    },
    {
        $set: { status : "INACTIVE" }
    }
);

---------------------------------

db.getCollection("po_tracing_workbench").updateOne(
    {
        "created_by": "650186c73a15e72763879b22",
        "config_name": "Garment V2",
        "po_tracing_launch_config_metadata.name": "PO Tracing - GARMENTS",
        "po_metadata.name": "7172699-24",
        "seller_metadata.name": "CRONY TEX SOURCING LTD"
    },
    {
        $set: { "status": "INACTIVE" }
    }
);

-----------------------------------

db.getCollection("po_tracing_workbench").updateOne(
    {
        "created_by": "650186c73a15e72763879b22",
        "config_name": "Garment V2",
        "po_tracing_launch_config_metadata.name": "PO Tracing - GARMENTS",
        "po_metadata.name": "8021103-24",
        "seller_metadata.name": "THAT'S IT KNIT LTD."
    },
    {
        $set: { "status": "INACTIVE" }
    }
);

--------------------------------

db.getCollection("po_tracing_workbench").updateOne(
    {
        "created_by": "650186c73a15e72763879b22",
        "config_name": "Garment V2",
        "po_tracing_launch_config_metadata.name": "PO Tracing - GARMENTS",
        "po_metadata.name": "8160707-24",
        "seller_metadata.name": "TAMISHNA FASHION WEAR LTD."
    },
    {
        $set: { "status": "INACTIVE" }
    }
);

---------------------------------

db.getCollection("po_tracing_workbench").updateOne(
    {
        "created_by": "650186c73a15e72763879b22",
        "config_name": "Garment V2",
        "po_tracing_launch_config_metadata.name": "PO Tracing - GARMENTS",
        "po_metadata.name": "8491694-24",
        "seller_metadata.name": "SINOSKY  LIMITED"
    },
    {
        $set: { "status": "INACTIVE" }
    }
);

-----------------------------------

db.getCollection("po_tracing_workbench").updateMany(
    {
        "created_by": "650186c73a15e72763879b22",
        "config_name": "Garment V2",
        "po_tracing_launch_config_metadata.name": "PO Tracing - GARMENTS",
        "po_metadata.name": {
            $in : [
                "8491694-24", "9751987-25", "9752000-25", "9752001-25", "9752002-25"
            ]
        },
        "seller_metadata.name": "SINOSKY  LIMITED"
    },
    {
        $set: { "status": "INACTIVE" }
    }
);

----------------------------

db.getCollection("po_tracing_workbench").updateMany(
    {
        "created_by": "650186c73a15e72763879b22",
        "config_name": "Garment V2",
        "po_tracing_launch_config_metadata.name": "PO Tracing - GARMENTS",
        "po_metadata.name": {
            $in : [
                "8231192-24", "8231193-24", "8231194-24", "8231195-24", "8231196-24",
                "8750973-24", "8750974-24", "8750975-24", "8750976-24", "8750977-24",
                "8750978-24", "8750979-24", "8751654-24", "8751655-24", "8751656-24",
                "8751657-24", "8751658-24", "8751659-24", "8751660-24"
            ]
        },
        "seller_metadata.name": "S CHEER HK CO."
    },
    {
        $set: { "status": "INACTIVE" }
    }
);

-----------------------------------

db.getCollection("po_tracing_workbench").updateOne(
    {
        "created_by": "650186c73a15e72763879b22",
        "config_name": "Garment V2",
        "po_tracing_launch_config_metadata.name": "PO Tracing - GARMENTS",
        "po_metadata.name": "8752705-24",
        "seller_metadata.name": "V02549 Shanghai Jianglong"
    },
    {
        $set: { "status": "INACTIVE" }
    }
);

------------------------------------

db.getCollection("po_tracing_workbench").updateOne(
    {
        "created_by": "650186c73a15e72763879b22",
        "config_name": "Garment V2",
        "po_tracing_launch_config_metadata.name": "PO Tracing - GARMENTS",
        "po_metadata.name": "9120005-25",
        "seller_metadata.name": "EK ETHIOPIA KNITTED MANUFACTURING P"
    },
    {
        $set: { "status": "INACTIVE" }
    }
);

-------------------------------------

db.getCollection("po_tracing_workbench").updateMany(
    {
        "created_by": "650186c73a15e72763879b22",
        "config_name": "Garment V2",
        "po_tracing_launch_config_metadata.name": "PO Tracing - GARMENTS",
        "po_metadata.name": {
            $in : [
                "9140004-25", "9140005-25", "9140006-25", "9140007-25", "9140008-25", "9140009-25",
                "9140010-25", "9140011-25", "9140012-25", "9140013-25", "9140014-25", "9140015-25",
                "9140016-25", "9140017-25", "9140018-25", "9140019-25", "9140400-25", "9140401-25",
                "9140402-25", "9140403-25", "9140404-25", "9140405-25", "9140406-25"
            ]
        },
        "seller_metadata.name": "AURODESIGN PVT LTD"
    },
    {
        $set: { "status": "INACTIVE" }
    }
);

------------------------------------

db.getCollection("po_tracing_workbench").updateOne(
    {
        "created_by": "650186c73a15e72763879b22",
        "config_name": "Garment V2",
        "po_tracing_launch_config_metadata.name": "PO Tracing - GARMENTS",
        "po_metadata.name": "9140351-25",
        "seller_metadata.name": "NINGBO TOP TEX-TECH CO.,LTD."
    },
    {
        $set: { "status": "INACTIVE" }
    }
);

---------------------------------

db.getCollection("po_tracing_workbench").updateMany(
    {
        "created_by": "650186c73a15e72763879b22",
        "config_name": "Garment V2",
        "po_tracing_launch_config_metadata.name": "PO Tracing - GARMENTS",
        "po_metadata.name": {
            $in : [
                "9141320-25", "9141321-25", "9141322-25", "9141323-25", "9141324-25", "9141325-25",
                "9141326-25", "9141327-25", "9141328-25", "9141329-25", "9141330-25", "9141331-25",
                "9141332-25", "9141333-25", "9141334-25", "9141335-25"
            ]
        },
        "seller_metadata.name": "GBX TRADING FZE"
    },
    {
        $set: { "status": "INACTIVE" }
    }
);

----------------------------------

db.getCollection("po_tracing_workbench").updateMany(
    {
        "created_by": "650186c73a15e72763879b22",
        "config_name": "Garment V2",
        "po_tracing_launch_config_metadata.name": "PO Tracing - GARMENTS",
        "po_metadata.name": {
            $in : [
                "9300461-25", "9300462-25", "9300463-25", "9300464-25", "9300465-25",
                "9300466-25", "9300467-25", "9300468-25", "9300469-25", "9300470-25",
                "9300471-25", "9300472-25", "9300473-25", "9300474-25", "9300475-25"
            ]
        },
        "seller_metadata.name": "ISHMAN INTERNATIONAL"
    },
    {
        $set: { "status": "INACTIVE" }
    }
);

-------------------------------

db.getCollection("po_tracing_workbench").updateMany(
    {
        "created_by": "650186c73a15e72763879b22",
        "config_name": "Garment V2",
        "po_tracing_launch_config_metadata.name": "PO Tracing - GARMENTS",
        "po_metadata.name": {
            $in : [
                "9312249-25", "9312250-25", "9312251-25", "9312252-25", "9312253-25", "9312254-25"
            ]
        },
        "seller_metadata.name": "Golden Match Sportswear Co., Ltd"
    },
    {
        $set: { "status": "INACTIVE" }
    }
);

-------------------------------------

db.getCollection("po_tracing_workbench").updateOne(
    {
        "created_by": "650186c73a15e72763879b22",
        "config_name": "Garment V2",
        "po_tracing_launch_config_metadata.name": "PO Tracing - GARMENTS",
        "po_metadata.name": "9400784-25",
        "seller_metadata.name": "Zhejiang Xinhongzhou Trading Co,Ltd."
    },
    {
        $set: { "status": "INACTIVE" }
    }
);

------------------------------------

db.getCollection("po_tracing_workbench").updateOne(
    {
        "created_by": "652400234f5df53e99a9d388",
        "config_name": "Garment",
        "po_tracing_launch_config_metadata.name": "PO Tracing - SCM",
        "po_metadata.name": "7172699-24",
        "seller_metadata.name": "CRONY TEX SOURCING LTD"
    },
    {
        $set: { "status": "INACTIVE" }
    }
);

-------------------------------------





db.getCollection("po_tracing_shipments").updateMany(
    {
        "po_tracing_workbench_uuid": {
            $in: [
                "4b8b83d6-223a-4aa5-9b74-2a4b257990b1",
                "658306d3-8904-4f83-b8ad-50b6f2b8b7de",
                "731a4b13-a4bb-49dc-8634-91adc8af7faa",
                "84daee8d-ef33-45cb-9cf9-b9bbb853cc2d",
                "c0bed733-65fa-42e5-9768-b1c8d338fc9b",
                "eb8f8f5d-c3a5-412b-ac48-f735eebb211a",
                "17e774c8-cb0d-4a15-82a4-a983160de678",
                "036e8a4b-91cc-44b4-8c88-1134e9ad8613",
                "cf8a9a01-7d29-45b8-bf53-02386bdb1770",
                "a0ea2f6d-4f87-41c0-aba7-9928aa9b0103",
                "723307a1-5d56-4db1-8bea-a636815caafb",
                "b6358577-8f3b-4e33-bf51-b24af345f12c",
                "b5220a8d-c4e6-4af5-a522-7c536fc81278",
                "6ab37277-5ea2-4b72-a7df-a29fe493d349",
                "ec9276ba-c688-4499-a49a-a7fa468c9958",
                "51d7c681-d47f-4f2c-bada-faec28e43725",
                "135c612c-976d-47bb-a9a2-96c0a827b1e9",
                "e71b4c43-819d-4ce5-a52f-e38c498fae33",
                "86548dae-f332-4d8e-9a39-e6aa9afdf32e",
                "f20fa59a-2615-4149-92f8-6939f835d37b",
                "fbb989d2-615a-48fb-b833-3b5470a928ae",
                "46ec2ff6-7f8a-419e-a63e-1f878d153550",
                "39e2f4b6-68bb-421c-9874-15405231f02c",
                "ee4056ff-e372-47b1-abc9-2cacbbf629db",
                "652ddb04-f1aa-4fe2-a6a5-b32bba0395f4",
                "8ca88237-a456-49b3-888a-4877fcf07eab",
                "a1ce96cd-4ea3-4809-9b32-31729feac6ec",
                "2c2f2060-0bca-448e-976d-490942f43ed8",
                "29d2fd70-5173-43cb-a2bc-b8c4d63a905a",
                "4bddfaac-56ab-42dd-a761-711cebba3535",
                "a43042ca-aa89-4572-a587-8a710e2fd333",
                "9a617e63-85a0-47b2-9d1d-b74eba6842af",
                "3670c4c3-a8cc-4e6a-a139-deae2769b1c3",
                "dcb3f5ea-43d5-4288-a771-26bfe5a6f86c",
                "39d9cdef-c071-4f12-95a9-996c8e875a57",
                "a28afdfa-eae5-4367-b4bb-76e1c6bcff70",
                "dcf3d6ca-0a0c-492f-a282-a3b25d92446a",
                "28cde05f-b7a9-449a-86dd-314157a70823",
                "59209215-931d-4545-aba3-88560a305866",
                "0baa4d52-ae2c-4f2d-9859-541bf77de3f1",
                "29a399aa-17f7-4065-9d9e-8ec36aee23aa",
                "f518b639-19c1-4493-9dcf-b4873f67eaeb",
                "a640d1a6-a4c0-4c1b-ab8b-9590b11908b8",
                "7ec4f527-7092-4d7e-ba12-ff6220fd7961",
                "b5573fc5-9ea9-4747-a315-e5ea718d6e6d",
                "5f8a1d2f-5a42-4d99-9957-58f00e22bdbf",
                "dbf1d9d1-61cb-468b-b55a-448567143ed5",
                "790e3e59-b009-4103-9782-fe878e442a42",
                "7b4bc53e-5700-4868-9b5c-0372a6868525",
                "63182352-4c9e-4240-8e2c-33d1e97b202f",
                "3f10a206-a789-4ad1-a192-45e9f952cd7f",
                "acd41469-9ebb-412c-897b-5f3c6dc933e9",
                "f8b49975-5d32-4e96-9ff4-57035edd3568",
                "650fa2e5-5fa6-4d0c-ae48-d4db320491a0",
                "6b49394f-8425-4973-ad14-4ee3ceece914",
                "1c7672f7-7c4e-4586-992c-d441280c79c6",
                "0b983699-b309-480d-b87e-b9864f3164d6",
                "d23a59a5-3465-4811-80f6-f71b9ec55f6b",
                "fd484e7a-13e7-4d7a-b892-0bef473c3db1",
                "4e265c84-f0f2-458e-921a-85aeb390961e",
                "8fa37bdd-e381-424f-aaa8-b5847f016487",
                "65d4d968-b1ab-447c-ad28-4dfe3bb8bf03",
                "621f2e83-2d3b-483d-aa7a-a8a34d97d292",
                "51c2e0a6-5b50-4927-b2d0-5663908e9e87",
                "7a9767b7-1c70-41ef-b3c9-6e567aaed136",
                "a091e3bf-d90b-46fa-8604-462c437373e9",
                "c9cfbfac-9219-4abc-a885-4f1391c57d03",
                "d43df0b5-43e3-4c1b-b3be-fefd6979e08f",
                "fd4f71f4-e5d4-4628-9aa9-08325f02a638",
                "063d825b-5982-42f2-ab45-425665ae96c8",
                "f3e2cf56-6943-4d86-b52b-e42aea3a2954",
                "8b9608e0-1718-494f-a9c5-51f2aee11055",
                "f6db7690-57ca-4342-ad45-e7f2ba0e5395",
                "a00e7b4d-4774-41fd-ab1e-9fb385cc8d79",
                "6577c104-5fe1-4654-905e-505666c5693d",
                "2f65b708-8230-4b43-a492-8f7a95e8c9b6",
                "dd3b1e24-f452-4862-a5de-fe9820e8f30f",
                "83605f68-d71f-4158-ac1e-67dbdfe70304",
                "b4c16b51-4c11-4498-913d-b9709382349b",
                "2c1cec68-228d-4908-997f-5d08d4c0ed1e",
                "612c6284-31c9-4096-8906-6e2284f7fff9",
                "f3c6a105-098b-44eb-8517-c83ce8e2279d",
                "8a67fcdb-14fd-4691-aa0f-319b9c02649e",
                "cbf1ff4c-aef4-428d-ab41-fdf2c8b2ab7b",
                "fbd33937-f7a2-462a-a041-eac5b7b3e81b",
                "f893d65d-ce1a-404b-bbfa-8477ff29a6b8",
                "81fe8a75-ac9a-41fd-a10b-448bd5f639b7",
                "779dda61-b94d-45a7-af01-3e6f60c40e33",
                "67fcf5bf-3b93-4d17-93cd-a6e626eca349",
                "5296f079-5324-493f-a8cb-f78a4401fccf",
                "464d7c49-25e3-46e6-a8c4-2ad73942be5b",
                "f255b6d6-130d-4e4c-855a-dc1b8afb6ee6",
                "c01c1941-b6d4-4181-b973-511383f49610",
                "a0d12e58-9783-4de8-85e2-ff1e617ce325",
                "0c0acf15-7a7b-4a08-9258-5e86fe6588ec",
                "7b79e6f1-9c2e-41aa-8b73-fc1dd1bb030d",
                "a5de528e-2d99-4c5e-aa6d-dd6e5cb3e936",
                "bb99cdb7-aacb-403a-a1f5-a4d17e08b473",
                "b12c4005-89b6-42f2-b79b-fa42b6bf6d21",
                "39351584-bc35-485b-a8d8-bf3bfc940443",
                "0c6ce4a6-e438-4a42-8549-bb28667f9635",
                "01478074-dd88-4fee-a01c-5b00a1c1006d",
                "ee9d4654-ad84-4b47-b948-3473fbcbbbd3",
                "302344c3-937f-46eb-b03a-1f703a3c47b8",
                "650dc368-1c4a-4ba0-86b3-6ece22b89f04",
                "a1e1c5f0-0ba7-427b-90ca-9b14c06e642e",
                "a9649dde-e5de-43b2-bec6-01b83a8c5a87",
                "f7b5db5d-5c77-48c5-925c-2656c63444a7",
                "2966716c-7697-4655-8a21-3b1f590031e9",
                "5017459d-aaa7-4661-a4d0-1ace500aec41",
                "d6eafcac-1d61-4ff4-9454-939e42825c5b",
                "93c9be7f-9774-48f3-b557-24687316b617",
                "37983917-f4ed-439d-969b-d83777369fda",
                "601c1180-ffb0-4367-99de-65b92ee4e0f8",
                "65cdc8b9-a8ad-4369-a9a0-0df8d9fd8f14",
                "3921bf4c-d3a0-42d6-bdd1-08afc47f7c7e",
                "6599a296-985f-43e8-8dc1-00056dc0579b",
                "d006fdef-ecb7-4b1f-a27f-64d8237b5b6c",
                "879953e3-844b-45bd-ac1d-9c688effd3ca",
                "f7aeab26-09e1-4063-a188-11e977368031",
                "4a1559a8-a7bf-4a39-8654-331b9bd8003f",
                "6ba8b4e4-2a59-40a0-b277-b433982d9592",
                "c5d95656-b522-4738-a90c-a10ba64b85b9",
                "b284507a-ba40-4c87-b554-7e5042c16a1e",
                "8a8ccbca-c93f-4a3e-a4c5-37b3d0548c93",
                "7db77b0f-5b24-45d3-80e0-a349fe09860e",
                "ef0cfba2-7397-4f61-98df-af543c42d8b0",
                "af4ab0a9-87da-4ee8-9295-81ea6fa28bd9",
                "fb8240e4-a44e-42ae-9c9e-0c31710258cd",
                "332bab13-d439-46dc-b7cc-26630eae7222",
                "d2d22296-e056-487f-83fa-a063b04a4922",
                "1f6a7fd7-668d-4b5d-b7a0-7ad737880dfd",
                "10e67930-6636-46c1-b417-eaf1a56c4f8e",
                "d8f59572-510b-478b-8987-6d3172203ece",
                "48c83758-e989-44ad-b36c-06c6ce198759",
                "587049b9-37c7-4f16-abfb-a56e1d492dd9",
                "d9fe3eed-38a4-43dc-8b9a-332c19bbff87",
                "169174dc-b56a-4a9d-bb1d-20b6eba4d285",
                "4ff5fb0b-a352-4fde-82b0-598d72e3b14d",
                "d28c982d-5b56-4445-97ce-c5175a145102",
                "b2231cfc-8e2c-4239-ab56-890fb9899f8f",
                "969ce676-f83d-412f-a280-a3a1d625bb30",
                "bbb54ab2-a55e-47da-8e79-65878d181007",
                "c440f1dd-731b-466c-a388-4d633e4fff87",
                "b683a901-5531-4c05-9938-523f0a08ca39",
                "ce460052-df19-4d0c-9b97-04f6c2e42ba9",
                "923405a2-a14b-42ca-9ede-ee39690024db",
                "34a1d341-9c01-4ae1-9b04-fb2f3a57371b",
                "dcac433b-78dc-403c-89b0-ac558ad0f2cc",
                "bfb58cf1-f79f-43cf-bd5d-4c5b378bd94a",
                "21c16c9c-4402-43f2-af89-8473a9c3bacc",
                "75dc1538-e603-4f80-a5b5-277ab0415761",
                "b2c22ea2-86ad-4bed-9338-d0cb6aeca019",
                "8c03af48-e085-4891-92ba-c3acb4d8c9af",
                "cbdaa169-0162-4290-a100-c9b5fe3ee193",
                "a27a098d-1e4b-4cd7-abc3-5fba8bf566b8",
                "02f93acc-88b3-4426-82d1-f5377eb09ef1",
                "997ee7d5-4ca1-4b9a-a308-d085dc9a0ad4",
                "b6f8e68c-d07e-4953-ba64-819a7ab2ae20",
                "c699300e-5202-4c99-a14e-af96002f25e5",
                "a0478608-1781-46c4-9c9e-098e285bb821",
                "83d87c9c-6472-4fbb-96e0-562ccd13f272",
                "aefdd71a-38c7-4337-8e6b-33b858962396",
                "e164b1d3-2b08-4c67-8366-6f6a6389a2bf"
            ]
        }
    },
    {
        $set: {
            status : "IN_ACTIVE",
            update_ts: ISODate()
        }
    }
);
