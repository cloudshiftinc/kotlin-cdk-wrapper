@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dynamodb.ImportSourceSpecification
import software.amazon.awscdk.services.dynamodb.InputCompressionType
import software.amazon.awscdk.services.dynamodb.InputFormat
import software.amazon.awscdk.services.s3.IBucket

/**
 * Properties for importing data from the S3.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.s3.*;
 * IBucket bucket;
 * App app = new App();
 * Stack stack = new Stack(app, "Stack");
 * Table.Builder.create(stack, "Table")
 * .partitionKey(Attribute.builder()
 * .name("id")
 * .type(AttributeType.STRING)
 * .build())
 * .importSource(ImportSourceSpecification.builder()
 * .compressionType(InputCompressionType.GZIP)
 * .inputFormat(InputFormat.dynamoDBJson())
 * .bucket(bucket)
 * .keyPrefix("prefix")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ImportSourceSpecificationDsl {
    private val cdkBuilder: ImportSourceSpecification.Builder = ImportSourceSpecification.builder()

    /** @param bucket The S3 bucket that is being imported from. */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /** @param bucketOwner The account number of the S3 bucket that is being imported from. */
    public fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
    }

    /** @param compressionType The compression type of the imported data. */
    public fun compressionType(compressionType: InputCompressionType) {
        cdkBuilder.compressionType(compressionType)
    }

    /** @param inputFormat The format of the imported data. */
    public fun inputFormat(inputFormat: InputFormat) {
        cdkBuilder.inputFormat(inputFormat)
    }

    /** @param keyPrefix The key prefix shared by all S3 Objects that are being imported. */
    public fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
    }

    public fun build(): ImportSourceSpecification = cdkBuilder.build()
}
