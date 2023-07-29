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

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck
import software.constructs.Construct

/**
 * Creates a readiness check in Amazon Route 53 Application Recovery Controller.
 *
 * A readiness check continually monitors a resource set in your application, such as a set of
 * Amazon Aurora instances, that Route 53 ARC is auditing recovery readiness for. The audits run
 * once every minute on every resource that's associated with a readiness check.
 *
 * Every resource type has a set of rules associated with it that Route 53 ARC uses to audit
 * resources for readiness. For more information, see
 * [Readiness rules descriptions](https://docs.aws.amazon.com/r53recovery/latest/dg/recovery-readiness.rules-resources.html)
 * in the Amazon Route 53 Application Recovery Controller Developer Guide.
 *
 * Route 53 ARC Readiness supports us-east-1 and us-west-2 AWS Regions only.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoveryreadiness.*;
 * CfnReadinessCheck cfnReadinessCheck = CfnReadinessCheck.Builder.create(this,
 * "MyCfnReadinessCheck")
 * .readinessCheckName("readinessCheckName")
 * .resourceSetName("resourceSetName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html)
 */
@CdkDslMarker
public class CfnReadinessCheckDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnReadinessCheck.Builder = CfnReadinessCheck.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The name of the readiness check to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-readinesscheckname)
     *
     * @param readinessCheckName The name of the readiness check to create.
     */
    public fun readinessCheckName(readinessCheckName: String) {
        cdkBuilder.readinessCheckName(readinessCheckName)
    }

    /**
     * The name of the resource set to check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-resourcesetname)
     *
     * @param resourceSetName The name of the resource set to check.
     */
    public fun resourceSetName(resourceSetName: String) {
        cdkBuilder.resourceSetName(resourceSetName)
    }

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-tags)
     *
     * @param tags A collection of tags associated with a resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-tags)
     *
     * @param tags A collection of tags associated with a resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnReadinessCheck {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
