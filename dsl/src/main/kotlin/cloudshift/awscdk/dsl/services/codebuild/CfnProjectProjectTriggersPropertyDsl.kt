@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * `ProjectTriggers` is a property of the [AWS CodeBuild
 * Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
 * resource that specifies webhooks that trigger an AWS CodeBuild build.
 *
 *
 * The Webhook feature isn't available in AWS CloudFormation for GitHub Enterprise projects. Use the
 * AWS CLI or AWS CodeBuild console to create the webhook.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * ProjectTriggersProperty projectTriggersProperty = ProjectTriggersProperty.builder()
 * .buildType("buildType")
 * .filterGroups(List.of(List.of(WebhookFilterProperty.builder()
 * .pattern("pattern")
 * .type("type")
 * // the properties below are optional
 * .excludeMatchedPattern(false)
 * .build())))
 * .webhook(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html)
 */
@CdkDslMarker
public class CfnProjectProjectTriggersPropertyDsl {
    private val cdkBuilder: CfnProject.ProjectTriggersProperty.Builder =
        CfnProject.ProjectTriggersProperty.builder()

    private val _filterGroups: MutableList<Any> = mutableListOf()

    /**
     * @param buildType Specifies the type of build this webhook will trigger. Allowed values are:.
     * * **BUILD** - A single build
     * * **BUILD_BATCH** - A batch build
     */
    public fun buildType(buildType: String) {
        cdkBuilder.buildType(buildType)
    }

    /**
     * @param filterGroups A list of lists of `WebhookFilter` objects used to determine which webhook
     * events are triggered.
     * At least one `WebhookFilter` in the array must specify `EVENT` as its type.
     */
    public fun filterGroups(vararg filterGroups: Any) {
        _filterGroups.addAll(listOf(*filterGroups))
    }

    /**
     * @param filterGroups A list of lists of `WebhookFilter` objects used to determine which webhook
     * events are triggered.
     * At least one `WebhookFilter` in the array must specify `EVENT` as its type.
     */
    public fun filterGroups(filterGroups: Collection<Any>) {
        _filterGroups.addAll(filterGroups)
    }

    /**
     * @param filterGroups A list of lists of `WebhookFilter` objects used to determine which webhook
     * events are triggered.
     * At least one `WebhookFilter` in the array must specify `EVENT` as its type.
     */
    public fun filterGroups(filterGroups: IResolvable) {
        cdkBuilder.filterGroups(filterGroups)
    }

    /**
     * @param webhook Specifies whether or not to begin automatically rebuilding the source code every
     * time a code change is pushed to the repository.
     */
    public fun webhook(webhook: Boolean) {
        cdkBuilder.webhook(webhook)
    }

    /**
     * @param webhook Specifies whether or not to begin automatically rebuilding the source code every
     * time a code change is pushed to the repository.
     */
    public fun webhook(webhook: IResolvable) {
        cdkBuilder.webhook(webhook)
    }

    public fun build(): CfnProject.ProjectTriggersProperty {
        if (_filterGroups.isNotEmpty()) cdkBuilder.filterGroups(_filterGroups)
        return cdkBuilder.build()
    }
}
