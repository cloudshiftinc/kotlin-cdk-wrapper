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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

/**
 * Configuration information of a Kinesis video stream.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * KinesisVideoStreamConfigProperty kinesisVideoStreamConfigProperty =
 * KinesisVideoStreamConfigProperty.builder()
 * .prefix("prefix")
 * .retentionPeriodHours(123)
 * // the properties below are optional
 * .encryptionConfig(EncryptionConfigProperty.builder()
 * .encryptionType("encryptionType")
 * .keyId("keyId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisvideostreamconfig.html)
 */
@CdkDslMarker
public class CfnInstanceStorageConfigKinesisVideoStreamConfigPropertyDsl {
    private val cdkBuilder: CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.Builder =
        CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.builder()

    /** @param encryptionConfig The encryption configuration. */
    public fun encryptionConfig(encryptionConfig: IResolvable) {
        cdkBuilder.encryptionConfig(encryptionConfig)
    }

    /** @param encryptionConfig The encryption configuration. */
    public fun encryptionConfig(
        encryptionConfig: CfnInstanceStorageConfig.EncryptionConfigProperty
    ) {
        cdkBuilder.encryptionConfig(encryptionConfig)
    }

    /** @param prefix The prefix of the video stream. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    /**
     * @param retentionPeriodHours The number of hours data is retained in the stream. Kinesis Video
     *   Streams retains the data in a data store that is associated with the stream.
     *
     * The default value is 0, indicating that the stream does not persist data.
     */
    public fun retentionPeriodHours(retentionPeriodHours: Number) {
        cdkBuilder.retentionPeriodHours(retentionPeriodHours)
    }

    public fun build(): CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty =
        cdkBuilder.build()
}
