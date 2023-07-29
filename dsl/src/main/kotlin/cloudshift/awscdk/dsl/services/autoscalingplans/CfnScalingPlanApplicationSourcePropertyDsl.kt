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

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

/**
 * `ApplicationSource` is a property of
 * [ScalingPlan](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html)
 * that specifies the application source to use with AWS Auto Scaling ( Auto Scaling Plans ). You
 * can create one scaling plan per application source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscalingplans.*;
 * ApplicationSourceProperty applicationSourceProperty = ApplicationSourceProperty.builder()
 * .cloudFormationStackArn("cloudFormationStackArn")
 * .tagFilters(List.of(TagFilterProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .values(List.of("values"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html)
 */
@CdkDslMarker
public class CfnScalingPlanApplicationSourcePropertyDsl {
    private val cdkBuilder: CfnScalingPlan.ApplicationSourceProperty.Builder =
        CfnScalingPlan.ApplicationSourceProperty.builder()

    private val _tagFilters: MutableList<Any> = mutableListOf()

    /**
     * @param cloudFormationStackArn The Amazon Resource Name (ARN) of a CloudFormation stack. You
     *   must specify either a `CloudFormationStackARN` or `TagFilters` .
     */
    public fun cloudFormationStackArn(cloudFormationStackArn: String) {
        cdkBuilder.cloudFormationStackArn(cloudFormationStackArn)
    }

    /**
     * @param tagFilters A set of tag filters (keys and values). Each tag filter specified must
     *   contain a key with values as optional. Each scaling plan can include up to 50 keys, and
     *   each key can include up to 20 values.
     *
     * Tags are part of the syntax that you use to specify the resources you want returned when
     * configuring a scaling plan from the AWS Auto Scaling console. You do not need to specify
     * valid tag filter values when you create a scaling plan with CloudFormation. The `Key` and
     * `Values` properties can accept any value as long as the combination of values is unique
     * across scaling plans. However, if you also want to use the AWS Auto Scaling console to edit
     * the scaling plan, then you must specify valid values.
     *
     * You must specify either a `CloudFormationStackARN` or `TagFilters` .
     */
    public fun tagFilters(vararg tagFilters: Any) {
        _tagFilters.addAll(listOf(*tagFilters))
    }

    /**
     * @param tagFilters A set of tag filters (keys and values). Each tag filter specified must
     *   contain a key with values as optional. Each scaling plan can include up to 50 keys, and
     *   each key can include up to 20 values.
     *
     * Tags are part of the syntax that you use to specify the resources you want returned when
     * configuring a scaling plan from the AWS Auto Scaling console. You do not need to specify
     * valid tag filter values when you create a scaling plan with CloudFormation. The `Key` and
     * `Values` properties can accept any value as long as the combination of values is unique
     * across scaling plans. However, if you also want to use the AWS Auto Scaling console to edit
     * the scaling plan, then you must specify valid values.
     *
     * You must specify either a `CloudFormationStackARN` or `TagFilters` .
     */
    public fun tagFilters(tagFilters: Collection<Any>) {
        _tagFilters.addAll(tagFilters)
    }

    /**
     * @param tagFilters A set of tag filters (keys and values). Each tag filter specified must
     *   contain a key with values as optional. Each scaling plan can include up to 50 keys, and
     *   each key can include up to 20 values.
     *
     * Tags are part of the syntax that you use to specify the resources you want returned when
     * configuring a scaling plan from the AWS Auto Scaling console. You do not need to specify
     * valid tag filter values when you create a scaling plan with CloudFormation. The `Key` and
     * `Values` properties can accept any value as long as the combination of values is unique
     * across scaling plans. However, if you also want to use the AWS Auto Scaling console to edit
     * the scaling plan, then you must specify valid values.
     *
     * You must specify either a `CloudFormationStackARN` or `TagFilters` .
     */
    public fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters)
    }

    public fun build(): CfnScalingPlan.ApplicationSourceProperty {
        if (_tagFilters.isNotEmpty()) cdkBuilder.tagFilters(_tagFilters)
        return cdkBuilder.build()
    }
}
