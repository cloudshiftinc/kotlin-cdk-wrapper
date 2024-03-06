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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance
import software.constructs.Construct

/**
 * An AWS Verified Access instance is a regional entity that evaluates application requests and
 * grants access only when your security requirements are met.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVerifiedAccessInstance cfnVerifiedAccessInstance =
 * CfnVerifiedAccessInstance.Builder.create(this, "MyCfnVerifiedAccessInstance")
 * .description("description")
 * .fipsEnabled(false)
 * .loggingConfigurations(VerifiedAccessLogsProperty.builder()
 * .cloudWatchLogs(CloudWatchLogsProperty.builder()
 * .enabled(false)
 * .logGroup("logGroup")
 * .build())
 * .includeTrustContext(false)
 * .kinesisDataFirehose(KinesisDataFirehoseProperty.builder()
 * .deliveryStream("deliveryStream")
 * .enabled(false)
 * .build())
 * .logVersion("logVersion")
 * .s3(S3Property.builder()
 * .bucketName("bucketName")
 * .bucketOwner("bucketOwner")
 * .enabled(false)
 * .prefix("prefix")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .verifiedAccessTrustProviderIds(List.of("verifiedAccessTrustProviderIds"))
 * .verifiedAccessTrustProviders(List.of(VerifiedAccessTrustProviderProperty.builder()
 * .description("description")
 * .deviceTrustProviderType("deviceTrustProviderType")
 * .trustProviderType("trustProviderType")
 * .userTrustProviderType("userTrustProviderType")
 * .verifiedAccessTrustProviderId("verifiedAccessTrustProviderId")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html)
 */
@CdkDslMarker
public class CfnVerifiedAccessInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVerifiedAccessInstance.Builder =
        CfnVerifiedAccessInstance.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _verifiedAccessTrustProviderIds: MutableList<String> = mutableListOf()

    private val _verifiedAccessTrustProviders: MutableList<Any> = mutableListOf()

    /**
     * A description for the AWS Verified Access instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-description)
     *
     * @param description A description for the AWS Verified Access instance.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Indicates whether support for Federal Information Processing Standards (FIPS) is enabled on
     * the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-fipsenabled)
     *
     * @param fipsEnabled Indicates whether support for Federal Information Processing Standards
     *   (FIPS) is enabled on the instance.
     */
    public fun fipsEnabled(fipsEnabled: Boolean) {
        cdkBuilder.fipsEnabled(fipsEnabled)
    }

    /**
     * Indicates whether support for Federal Information Processing Standards (FIPS) is enabled on
     * the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-fipsenabled)
     *
     * @param fipsEnabled Indicates whether support for Federal Information Processing Standards
     *   (FIPS) is enabled on the instance.
     */
    public fun fipsEnabled(fipsEnabled: IResolvable) {
        cdkBuilder.fipsEnabled(fipsEnabled)
    }

    /**
     * The logging configuration for the Verified Access instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-loggingconfigurations)
     *
     * @param loggingConfigurations The logging configuration for the Verified Access instances.
     */
    public fun loggingConfigurations(loggingConfigurations: IResolvable) {
        cdkBuilder.loggingConfigurations(loggingConfigurations)
    }

    /**
     * The logging configuration for the Verified Access instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-loggingconfigurations)
     *
     * @param loggingConfigurations The logging configuration for the Verified Access instances.
     */
    public fun loggingConfigurations(
        loggingConfigurations: CfnVerifiedAccessInstance.VerifiedAccessLogsProperty
    ) {
        cdkBuilder.loggingConfigurations(loggingConfigurations)
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-tags)
     *
     * @param tags The tags.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-tags)
     *
     * @param tags The tags.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviderids)
     *
     * @param verifiedAccessTrustProviderIds The IDs of the AWS Verified Access trust providers.
     */
    public fun verifiedAccessTrustProviderIds(vararg verifiedAccessTrustProviderIds: String) {
        _verifiedAccessTrustProviderIds.addAll(listOf(*verifiedAccessTrustProviderIds))
    }

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviderids)
     *
     * @param verifiedAccessTrustProviderIds The IDs of the AWS Verified Access trust providers.
     */
    public fun verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds: Collection<String>) {
        _verifiedAccessTrustProviderIds.addAll(verifiedAccessTrustProviderIds)
    }

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviders)
     *
     * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers.
     */
    public fun verifiedAccessTrustProviders(vararg verifiedAccessTrustProviders: Any) {
        _verifiedAccessTrustProviders.addAll(listOf(*verifiedAccessTrustProviders))
    }

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviders)
     *
     * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers.
     */
    public fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: Collection<Any>) {
        _verifiedAccessTrustProviders.addAll(verifiedAccessTrustProviders)
    }

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviders)
     *
     * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers.
     */
    public fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: IResolvable) {
        cdkBuilder.verifiedAccessTrustProviders(verifiedAccessTrustProviders)
    }

    public fun build(): CfnVerifiedAccessInstance {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_verifiedAccessTrustProviderIds.isNotEmpty())
            cdkBuilder.verifiedAccessTrustProviderIds(_verifiedAccessTrustProviderIds)
        if (_verifiedAccessTrustProviders.isNotEmpty())
            cdkBuilder.verifiedAccessTrustProviders(_verifiedAccessTrustProviders)
        return cdkBuilder.build()
    }
}
