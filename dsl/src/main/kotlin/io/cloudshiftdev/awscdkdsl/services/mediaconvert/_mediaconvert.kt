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

package io.cloudshiftdev.awscdkdsl.services.mediaconvert

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplate
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps
import software.amazon.awscdk.services.mediaconvert.CfnPreset
import software.amazon.awscdk.services.mediaconvert.CfnPresetProps
import software.amazon.awscdk.services.mediaconvert.CfnQueue
import software.amazon.awscdk.services.mediaconvert.CfnQueueProps
import software.constructs.Construct

public object mediaconvert {
    /**
     * The AWS::MediaConvert::JobTemplate resource is an AWS Elemental MediaConvert resource type
     * that you can use to generate transcoding jobs.
     *
     * When you declare this entity in your AWS CloudFormation template, you pass in your
     * transcoding job settings in JSON or YAML format. This settings specification must be formed
     * in a particular way that conforms to AWS Elemental MediaConvert job validation. For more
     * information about creating a job template model for the `SettingsJson` property, see the
     * Remarks section later in this topic.
     *
     * For information about job templates, see
     * [Working with AWS Elemental MediaConvert Job Templates](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-job-templates.html)
     * in the ** .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconvert.*;
     * Object settingsJson;
     * Object tags;
     * CfnJobTemplate cfnJobTemplate = CfnJobTemplate.Builder.create(this, "MyCfnJobTemplate")
     * .settingsJson(settingsJson)
     * // the properties below are optional
     * .accelerationSettings(AccelerationSettingsProperty.builder()
     * .mode("mode")
     * .build())
     * .category("category")
     * .description("description")
     * .hopDestinations(List.of(HopDestinationProperty.builder()
     * .priority(123)
     * .queue("queue")
     * .waitMinutes(123)
     * .build()))
     * .name("name")
     * .priority(123)
     * .queue("queue")
     * .statusUpdateInterval("statusUpdateInterval")
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html)
     */
    public inline fun cfnJobTemplate(
        scope: Construct,
        id: String,
        block: CfnJobTemplateDsl.() -> Unit = {},
    ): CfnJobTemplate {
        val builder = CfnJobTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
     *
     * Outputs that use this feature incur pro-tier pricing. For information about feature
     * limitations, For more information, see
     * [Job Limitations for Accelerated Transcoding in AWS Elemental MediaConvert](https://docs.aws.amazon.com/mediaconvert/latest/ug/job-requirements.html)
     * in the *AWS Elemental MediaConvert User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconvert.*;
     * AccelerationSettingsProperty accelerationSettingsProperty =
     * AccelerationSettingsProperty.builder()
     * .mode("mode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-accelerationsettings.html)
     */
    public inline fun cfnJobTemplateAccelerationSettingsProperty(
        block: CfnJobTemplateAccelerationSettingsPropertyDsl.() -> Unit = {}
    ): CfnJobTemplate.AccelerationSettingsProperty {
        val builder = CfnJobTemplateAccelerationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Optional.
     *
     * Configuration for a destination queue to which the job can hop once a customer-defined
     * minimum wait time has passed. For more information, see
     * [Setting Up Queue Hopping to Avoid Long Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
     * in the *AWS Elemental MediaConvert User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconvert.*;
     * HopDestinationProperty hopDestinationProperty = HopDestinationProperty.builder()
     * .priority(123)
     * .queue("queue")
     * .waitMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-hopdestination.html)
     */
    public inline fun cfnJobTemplateHopDestinationProperty(
        block: CfnJobTemplateHopDestinationPropertyDsl.() -> Unit = {}
    ): CfnJobTemplate.HopDestinationProperty {
        val builder = CfnJobTemplateHopDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnJobTemplate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconvert.*;
     * Object settingsJson;
     * Object tags;
     * CfnJobTemplateProps cfnJobTemplateProps = CfnJobTemplateProps.builder()
     * .settingsJson(settingsJson)
     * // the properties below are optional
     * .accelerationSettings(AccelerationSettingsProperty.builder()
     * .mode("mode")
     * .build())
     * .category("category")
     * .description("description")
     * .hopDestinations(List.of(HopDestinationProperty.builder()
     * .priority(123)
     * .queue("queue")
     * .waitMinutes(123)
     * .build()))
     * .name("name")
     * .priority(123)
     * .queue("queue")
     * .statusUpdateInterval("statusUpdateInterval")
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html)
     */
    public inline fun cfnJobTemplateProps(
        block: CfnJobTemplatePropsDsl.() -> Unit = {}
    ): CfnJobTemplateProps {
        val builder = CfnJobTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::MediaConvert::Preset resource is an AWS Elemental MediaConvert resource type that
     * you can use to specify encoding settings for a single output in a transcoding job.
     *
     * When you declare this entity in your AWS CloudFormation template, you pass in your
     * transcoding job settings in JSON or YAML format. This settings specification must be formed
     * in a particular way that conforms to AWS Elemental MediaConvert job validation. For more
     * information about creating an output preset model for the `SettingsJson` property, see the
     * Remarks section later in this topic.
     *
     * For more information about output MediaConvert presets, see
     * [Working with AWS Elemental MediaConvert Output Presets](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-presets.html)
     * in the ** .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconvert.*;
     * Object settingsJson;
     * Object tags;
     * CfnPreset cfnPreset = CfnPreset.Builder.create(this, "MyCfnPreset")
     * .settingsJson(settingsJson)
     * // the properties below are optional
     * .category("category")
     * .description("description")
     * .name("name")
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html)
     */
    public inline fun cfnPreset(
        scope: Construct,
        id: String,
        block: CfnPresetDsl.() -> Unit = {},
    ): CfnPreset {
        val builder = CfnPresetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPreset`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconvert.*;
     * Object settingsJson;
     * Object tags;
     * CfnPresetProps cfnPresetProps = CfnPresetProps.builder()
     * .settingsJson(settingsJson)
     * // the properties below are optional
     * .category("category")
     * .description("description")
     * .name("name")
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-preset.html)
     */
    public inline fun cfnPresetProps(block: CfnPresetPropsDsl.() -> Unit = {}): CfnPresetProps {
        val builder = CfnPresetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::MediaConvert::Queue resource is an AWS Elemental MediaConvert resource type that you
     * can use to manage the resources that are available to your account for parallel processing of
     * jobs.
     *
     * For more information about queues, see
     * [Working with AWS Elemental MediaConvert Queues](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html)
     * in the ** .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconvert.*;
     * Object tags;
     * CfnQueue cfnQueue = CfnQueue.Builder.create(this, "MyCfnQueue")
     * .description("description")
     * .name("name")
     * .pricingPlan("pricingPlan")
     * .status("status")
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html)
     */
    public inline fun cfnQueue(
        scope: Construct,
        id: String,
        block: CfnQueueDsl.() -> Unit = {},
    ): CfnQueue {
        val builder = CfnQueueDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnQueue`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediaconvert.*;
     * Object tags;
     * CfnQueueProps cfnQueueProps = CfnQueueProps.builder()
     * .description("description")
     * .name("name")
     * .pricingPlan("pricingPlan")
     * .status("status")
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-queue.html)
     */
    public inline fun cfnQueueProps(block: CfnQueuePropsDsl.() -> Unit = {}): CfnQueueProps {
        val builder = CfnQueuePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
