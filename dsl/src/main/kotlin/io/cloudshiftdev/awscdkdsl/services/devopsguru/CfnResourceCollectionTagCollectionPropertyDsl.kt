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

package io.cloudshiftdev.awscdkdsl.services.devopsguru

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection

/**
 * A collection of AWS tags.
 *
 * Tags help you identify and organize your AWS resources. Many AWS services support tagging, so you
 * can assign the same tag to resources from different services to indicate that the resources are
 * related. For example, you can assign the same tag to an Amazon DynamoDB table resource that you
 * assign to an AWS Lambda function. For more information about using tags, see the
 * [Tagging best practices](https://docs.aws.amazon.com/whitepapers/latest/tagging-best-practices/tagging-best-practices.html)
 * whitepaper.
 *
 * Each AWS tag has two parts.
 * * A tag *key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag *keys*
 *   are case-sensitive.
 * * A field known as a tag *value* (for example, `111122223333` , `Production` , or a team name).
 *   Omitting the tag *value* is the same as using an empty string. Like tag *keys* , tag *values*
 *   are case-sensitive. The tag value is a required property when *AppBoundaryKey* is specified.
 *
 * Together these are known as *key* - *value* pairs.
 *
 * The string used for a *key* in a tag that you use to define your resource coverage must begin
 * with the prefix `Devops-guru-` . The tag *key* might be `DevOps-Guru-deployment-application` or
 * `devops-guru-rds-application` . When you create a *key* , the case of characters in the *key* can
 * be whatever you choose. After you create a *key* , it is case-sensitive. For example, DevOps Guru
 * works with a *key* named `devops-guru-rds` and a *key* named `DevOps-Guru-RDS` , and these act as
 * two different *keys* . Possible *key* / *value* pairs in your application might be
 * `Devops-Guru-production-application/RDS` or `Devops-Guru-production-application/containers` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devopsguru.*;
 * TagCollectionProperty tagCollectionProperty = TagCollectionProperty.builder()
 * .appBoundaryKey("appBoundaryKey")
 * .tagValues(List.of("tagValues"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-tagcollection.html)
 */
@CdkDslMarker
public class CfnResourceCollectionTagCollectionPropertyDsl {
    private val cdkBuilder: CfnResourceCollection.TagCollectionProperty.Builder =
        CfnResourceCollection.TagCollectionProperty.builder()

    private val _tagValues: MutableList<String> = mutableListOf()

    /**
     * @param appBoundaryKey An AWS tag *key* that is used to identify the AWS resources that DevOps
     *   Guru analyzes. All AWS resources in your account and Region tagged with this *key* make up
     *   your DevOps Guru application and analysis boundary.
     *
     * The string used for a *key* in a tag that you use to define your resource coverage must begin
     * with the prefix `Devops-guru-` . The tag *key* might be `DevOps-Guru-deployment-application`
     * or `devops-guru-rds-application` . When you create a *key* , the case of characters in the
     * *key* can be whatever you choose. After you create a *key* , it is case-sensitive. For
     * example, DevOps Guru works with a *key* named `devops-guru-rds` and a *key* named
     * `DevOps-Guru-RDS` , and these act as two different *keys* . Possible *key* / *value* pairs in
     * your application might be `Devops-Guru-production-application/RDS` or
     * `Devops-Guru-production-application/containers` .
     */
    public fun appBoundaryKey(appBoundaryKey: String) {
        cdkBuilder.appBoundaryKey(appBoundaryKey)
    }

    /**
     * @param tagValues The values in an AWS tag collection. The tag's *value* is a field used to
     *   associate a string with the tag *key* (for example, `111122223333` , `Production` , or a
     *   team name). The *key* and *value* are the tag's *key* pair. Omitting the tag *value* is the
     *   same as using an empty string. Like tag *keys* , tag *values* are case-sensitive. You can
     *   specify a maximum of 256 characters for a tag value. The tag value is a required property
     *   when *AppBoundaryKey* is specified.
     */
    public fun tagValues(vararg tagValues: String) {
        _tagValues.addAll(listOf(*tagValues))
    }

    /**
     * @param tagValues The values in an AWS tag collection. The tag's *value* is a field used to
     *   associate a string with the tag *key* (for example, `111122223333` , `Production` , or a
     *   team name). The *key* and *value* are the tag's *key* pair. Omitting the tag *value* is the
     *   same as using an empty string. Like tag *keys* , tag *values* are case-sensitive. You can
     *   specify a maximum of 256 characters for a tag value. The tag value is a required property
     *   when *AppBoundaryKey* is specified.
     */
    public fun tagValues(tagValues: Collection<String>) {
        _tagValues.addAll(tagValues)
    }

    public fun build(): CfnResourceCollection.TagCollectionProperty {
        if (_tagValues.isNotEmpty()) cdkBuilder.tagValues(_tagValues)
        return cdkBuilder.build()
    }
}
