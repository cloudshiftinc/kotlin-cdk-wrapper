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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
 *
 * For more information, see
 * [Object Lifecycle Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html)
 * in the *Amazon S3 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * LifecycleConfigurationProperty lifecycleConfigurationProperty =
 * LifecycleConfigurationProperty.builder()
 * .rules(List.of(RuleProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty.builder()
 * .daysAfterInitiation(123)
 * .build())
 * .expirationDate(new Date())
 * .expirationInDays(123)
 * .expiredObjectDeleteMarker(false)
 * .id("id")
 * .noncurrentVersionExpiration(NoncurrentVersionExpirationProperty.builder()
 * .noncurrentDays(123)
 * // the properties below are optional
 * .newerNoncurrentVersions(123)
 * .build())
 * .noncurrentVersionExpirationInDays(123)
 * .noncurrentVersionTransition(NoncurrentVersionTransitionProperty.builder()
 * .storageClass("storageClass")
 * .transitionInDays(123)
 * // the properties below are optional
 * .newerNoncurrentVersions(123)
 * .build())
 * .noncurrentVersionTransitions(List.of(NoncurrentVersionTransitionProperty.builder()
 * .storageClass("storageClass")
 * .transitionInDays(123)
 * // the properties below are optional
 * .newerNoncurrentVersions(123)
 * .build()))
 * .objectSizeGreaterThan(123)
 * .objectSizeLessThan(123)
 * .prefix("prefix")
 * .tagFilters(List.of(TagFilterProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .transition(TransitionProperty.builder()
 * .storageClass("storageClass")
 * // the properties below are optional
 * .transitionDate(new Date())
 * .transitionInDays(123)
 * .build())
 * .transitions(List.of(TransitionProperty.builder()
 * .storageClass("storageClass")
 * // the properties below are optional
 * .transitionDate(new Date())
 * .transitionInDays(123)
 * .build()))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketLifecycleConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.LifecycleConfigurationProperty.Builder =
        CfnBucket.LifecycleConfigurationProperty.builder()

    private val _rules: MutableList<Any> = mutableListOf()

    /** @param rules A lifecycle rule for individual objects in an Amazon S3 bucket. */
    public fun rules(vararg rules: Any) {
        _rules.addAll(listOf(*rules))
    }

    /** @param rules A lifecycle rule for individual objects in an Amazon S3 bucket. */
    public fun rules(rules: Collection<Any>) {
        _rules.addAll(rules)
    }

    /** @param rules A lifecycle rule for individual objects in an Amazon S3 bucket. */
    public fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules)
    }

    public fun build(): CfnBucket.LifecycleConfigurationProperty {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        return cdkBuilder.build()
    }
}
