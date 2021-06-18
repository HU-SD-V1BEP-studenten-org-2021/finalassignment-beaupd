package nl.hu.bep.fishysystem.webservices;

import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobContainerClientBuilder;

public class BlobStorageInterface {
    private final static String ENDPOINT = "https://fishysystemstorage.blob.core.windows.net/";
    private final static String SASTOKEN = "?sv=2020-02-10&ss=bfqt&srt=sco&sp=rwdlacuptfx&se=2021-06-18T21:28:34Z&st=2021-06-18T13:28:34Z&spr=https&sig=Wf4%2BZda4oqzld3ZMVZHAR0vXSnWpY%2BSK7DnXu9wHYZk%3D";
    private final static String CONTAINER = "fishysystem";

    private static BlobContainerClient blobContainer = new BlobContainerClientBuilder()
                                                                .endpoint(ENDPOINT)
                                                                .sasToken(SASTOKEN)
                                                                .containerName(CONTAINER)
                                                                .buildClient();

//    public String

}
