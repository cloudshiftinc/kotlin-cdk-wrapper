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

package io.cloudshiftdev.awscdkdsl.services.kinesisfirehose

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Indicates the method for setting up document ID.
 *
 * The supported methods are Firehose generated document ID and OpenSearch Service generated
 * document ID.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * DocumentIdOptionsProperty documentIdOptionsProperty = DocumentIdOptionsProperty.builder()
 * .defaultDocumentIdFormat("defaultDocumentIdFormat")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-documentidoptions.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamDocumentIdOptionsPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.DocumentIdOptionsProperty.Builder =
        CfnDeliveryStream.DocumentIdOptionsProperty.builder()

    /**
     * @param defaultDocumentIdFormat When the `FIREHOSE_DEFAULT` option is chosen, Firehose
     *   generates a unique document ID for each record based on a unique internal identifier. The
     *   generated document ID is stable across multiple delivery attempts, which helps prevent the
     *   same record from being indexed multiple times with different document IDs.
     *
     * When the `NO_DOCUMENT_ID` option is chosen, Firehose does not include any document IDs in the
     * requests it sends to the Amazon OpenSearch Service. This causes the Amazon OpenSearch Service
     * domain to generate document IDs. In case of multiple delivery attempts, this may cause the
     * same record to be indexed more than once with different document IDs. This option enables
     * write-heavy operations, such as the ingestion of logs and observability data, to consume less
     * resources in the Amazon OpenSearch Service domain, resulting in improved performance.
     */
    public fun defaultDocumentIdFormat(defaultDocumentIdFormat: String) {
        cdkBuilder.defaultDocumentIdFormat(defaultDocumentIdFormat)
    }

    public fun build(): CfnDeliveryStream.DocumentIdOptionsProperty = cdkBuilder.build()
}
