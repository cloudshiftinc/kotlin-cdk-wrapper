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

package io.cloudshiftdev.awscdkdsl.services.appconfig

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appconfig.CfnApplication
import software.constructs.Construct

/**
 * The `AWS::AppConfig::Application` resource creates an application.
 *
 * In AWS AppConfig , an application is simply an organizational construct like a folder. This
 * organizational construct has a relationship with some unit of executable code. For example, you
 * could create an application called MyMobileApp to organize and manage configuration data for a
 * mobile application installed by your users.
 *
 * AWS AppConfig requires that you create resources and deploy a configuration in the following
 * order:
 * * Create an application
 * * Create an environment
 * * Create a configuration profile
 * * Create a deployment strategy
 * * Deploy the configuration
 *
 * For more information, see
 * [AWS AppConfig](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in
 * the *AWS AppConfig User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(TagsProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html)
 */
@CdkDslMarker
public class CfnApplicationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

    private val _tags: MutableList<CfnApplication.TagsProperty> = mutableListOf()

    /**
     * A description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-description)
     *
     * @param description A description of the application.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * A name for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-name)
     *
     * @param name A name for the application.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Metadata to assign to the application.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-tags)
     *
     * @param tags Metadata to assign to the application.
     */
    public fun tags(tags: CfnApplicationTagsPropertyDsl.() -> Unit) {
        _tags.add(CfnApplicationTagsPropertyDsl().apply(tags).build())
    }

    /**
     * Metadata to assign to the application.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-tags)
     *
     * @param tags Metadata to assign to the application.
     */
    public fun tags(tags: Collection<CfnApplication.TagsProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnApplication {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
