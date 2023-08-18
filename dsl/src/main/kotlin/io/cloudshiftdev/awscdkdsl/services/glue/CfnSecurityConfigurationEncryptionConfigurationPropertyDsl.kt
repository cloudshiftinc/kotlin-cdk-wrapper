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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration

/**
 * Specifies an encryption configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * EncryptionConfigurationProperty encryptionConfigurationProperty =
 * EncryptionConfigurationProperty.builder()
 * .cloudWatchEncryption(CloudWatchEncryptionProperty.builder()
 * .cloudWatchEncryptionMode("cloudWatchEncryptionMode")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .jobBookmarksEncryption(JobBookmarksEncryptionProperty.builder()
 * .jobBookmarksEncryptionMode("jobBookmarksEncryptionMode")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .s3Encryptions(List.of(S3EncryptionProperty.builder()
 * .kmsKeyArn("kmsKeyArn")
 * .s3EncryptionMode("s3EncryptionMode")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-encryptionconfiguration.html)
 */
@CdkDslMarker
public class CfnSecurityConfigurationEncryptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnSecurityConfiguration.EncryptionConfigurationProperty.Builder =
        CfnSecurityConfiguration.EncryptionConfigurationProperty.builder()

    private val _s3Encryptions: MutableList<Any> = mutableListOf()

    /** @param cloudWatchEncryption The encryption configuration for Amazon CloudWatch. */
    public fun cloudWatchEncryption(cloudWatchEncryption: IResolvable) {
        cdkBuilder.cloudWatchEncryption(cloudWatchEncryption)
    }

    /** @param cloudWatchEncryption The encryption configuration for Amazon CloudWatch. */
    public fun cloudWatchEncryption(
        cloudWatchEncryption: CfnSecurityConfiguration.CloudWatchEncryptionProperty
    ) {
        cdkBuilder.cloudWatchEncryption(cloudWatchEncryption)
    }

    /** @param jobBookmarksEncryption The encryption configuration for job bookmarks. */
    public fun jobBookmarksEncryption(jobBookmarksEncryption: IResolvable) {
        cdkBuilder.jobBookmarksEncryption(jobBookmarksEncryption)
    }

    /** @param jobBookmarksEncryption The encryption configuration for job bookmarks. */
    public fun jobBookmarksEncryption(
        jobBookmarksEncryption: CfnSecurityConfiguration.JobBookmarksEncryptionProperty
    ) {
        cdkBuilder.jobBookmarksEncryption(jobBookmarksEncryption)
    }

    /**
     * @param s3Encryptions The encyption configuration for Amazon Simple Storage Service (Amazon
     *   S3) data.
     */
    public fun s3Encryptions(vararg s3Encryptions: Any) {
        _s3Encryptions.addAll(listOf(*s3Encryptions))
    }

    /**
     * @param s3Encryptions The encyption configuration for Amazon Simple Storage Service (Amazon
     *   S3) data.
     */
    public fun s3Encryptions(s3Encryptions: Collection<Any>) {
        _s3Encryptions.addAll(s3Encryptions)
    }

    /**
     * @param s3Encryptions The encyption configuration for Amazon Simple Storage Service (Amazon
     *   S3) data.
     */
    public fun s3Encryptions(s3Encryptions: IResolvable) {
        cdkBuilder.s3Encryptions(s3Encryptions)
    }

    public fun build(): CfnSecurityConfiguration.EncryptionConfigurationProperty {
        if (_s3Encryptions.isNotEmpty()) cdkBuilder.s3Encryptions(_s3Encryptions)
        return cdkBuilder.build()
    }
}
