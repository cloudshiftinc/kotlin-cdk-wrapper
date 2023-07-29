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

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnProject
import software.constructs.Construct

/**
 * Creates a project, which is the logical object in Evidently that can contain features, launches,
 * and experiments.
 *
 * Use projects to group similar features together.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.evidently.*;
 * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
 * .name("name")
 * // the properties below are optional
 * .appConfigResource(AppConfigResourceObjectProperty.builder()
 * .applicationId("applicationId")
 * .environmentId("environmentId")
 * .build())
 * .dataDelivery(DataDeliveryObjectProperty.builder()
 * .logGroup("logGroup")
 * .s3(S3DestinationProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .prefix("prefix")
 * .build())
 * .build())
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html)
 */
@CdkDslMarker
public class CfnProjectDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnProject.Builder = CfnProject.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Use this parameter if the project will use *client-side evaluation powered by AWS AppConfig*
     * .
     *
     * Client-side evaluation allows your application to assign variations to user sessions locally
     * instead of by calling the
     * [EvaluateFeature](https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html)
     * operation. This mitigates the latency and availability risks that come with an API call. For
     * more information, see
     * [Use client-side evaluation - powered by AWS AppConfig .](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-client-side-evaluation.html)
     *
     * This parameter is a structure that contains information about the AWS AppConfig application
     * that will be used as for client-side evaluation.
     *
     * To create a project that uses client-side evaluation, you must have the
     * `evidently:ExportProjectAsConfiguration` permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-appconfigresource)
     *
     * @param appConfigResource Use this parameter if the project will use *client-side evaluation
     *   powered by AWS AppConfig* .
     */
    public fun appConfigResource(appConfigResource: IResolvable) {
        cdkBuilder.appConfigResource(appConfigResource)
    }

    /**
     * Use this parameter if the project will use *client-side evaluation powered by AWS AppConfig*
     * .
     *
     * Client-side evaluation allows your application to assign variations to user sessions locally
     * instead of by calling the
     * [EvaluateFeature](https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html)
     * operation. This mitigates the latency and availability risks that come with an API call. For
     * more information, see
     * [Use client-side evaluation - powered by AWS AppConfig .](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-client-side-evaluation.html)
     *
     * This parameter is a structure that contains information about the AWS AppConfig application
     * that will be used as for client-side evaluation.
     *
     * To create a project that uses client-side evaluation, you must have the
     * `evidently:ExportProjectAsConfiguration` permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-appconfigresource)
     *
     * @param appConfigResource Use this parameter if the project will use *client-side evaluation
     *   powered by AWS AppConfig* .
     */
    public fun appConfigResource(appConfigResource: CfnProject.AppConfigResourceObjectProperty) {
        cdkBuilder.appConfigResource(appConfigResource)
    }

    /**
     * A structure that contains information about where Evidently is to store evaluation events for
     * longer term storage, if you choose to do so.
     *
     * If you choose not to store these events, Evidently deletes them after using them to produce
     * metrics and other experiment results that you can view.
     *
     * You can't specify both `CloudWatchLogs` and `S3Destination` in the same operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-datadelivery)
     *
     * @param dataDelivery A structure that contains information about where Evidently is to store
     *   evaluation events for longer term storage, if you choose to do so.
     */
    public fun dataDelivery(dataDelivery: IResolvable) {
        cdkBuilder.dataDelivery(dataDelivery)
    }

    /**
     * A structure that contains information about where Evidently is to store evaluation events for
     * longer term storage, if you choose to do so.
     *
     * If you choose not to store these events, Evidently deletes them after using them to produce
     * metrics and other experiment results that you can view.
     *
     * You can't specify both `CloudWatchLogs` and `S3Destination` in the same operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-datadelivery)
     *
     * @param dataDelivery A structure that contains information about where Evidently is to store
     *   evaluation events for longer term storage, if you choose to do so.
     */
    public fun dataDelivery(dataDelivery: CfnProject.DataDeliveryObjectProperty) {
        cdkBuilder.dataDelivery(dataDelivery)
    }

    /**
     * An optional description of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-description)
     *
     * @param description An optional description of the project.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name for the project.
     *
     * It can include up to 127 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-name)
     *
     * @param name The name for the project.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Assigns one or more tags (key-value pairs) to the project.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a project.
     *
     * For more information, see
     * [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-tags)
     *
     * @param tags Assigns one or more tags (key-value pairs) to the project.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Assigns one or more tags (key-value pairs) to the project.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a project.
     *
     * For more information, see
     * [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-tags)
     *
     * @param tags Assigns one or more tags (key-value pairs) to the project.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnProject {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
