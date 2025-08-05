@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspector

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.ResourceProps
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An Amazon Inspector assessment template.
 *
 * TODO: This class should implement IAssessmentTemplate and
 * "construct-ctor-props-type:aws-cdk-lib.aws_inspector.AssessmentTemplate" should be
 * removed from `awslint.json` when implementing the L2 construct
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.inspector.*;
 * CfnAssessmentTemplate cfnAssessmentTemplate;
 * IAssessmentTemplate assessmentTemplate = AssessmentTemplate.fromCfnAssessmentTemplate(this,
 * "MyAssessmentTemplate", cfnAssessmentTemplate);
 * Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.minutes(60)))
 * .target(new InspectorStartAssessmentRun(assessmentTemplate))
 * .build();
 * ```
 */
public open class AssessmentTemplate(
  cdkObject: software.amazon.awscdk.services.inspector.AssessmentTemplate,
) : Resource(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.inspector.AssessmentTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ResourceProps,
  ) :
      this(software.amazon.awscdk.services.inspector.AssessmentTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ResourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ResourceProps.Builder.() -> Unit,
  ) : this(scope, id, ResourceProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.inspector.AssessmentTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account ID this resource belongs to.
     *
     * Default: - the resource is in the same account as the stack it belongs to
     *
     * @param account The AWS account ID this resource belongs to. 
     */
    public fun account(account: String)

    /**
     * ARN to deduce region and account from.
     *
     * The ARN is parsed and the account and region are taken from the ARN.
     * This should be used for imported resources.
     *
     * Cannot be supplied together with either `account` or `region`.
     *
     * Default: - take environment from `account`, `region` parameters, or use Stack environment.
     *
     * @param environmentFromArn ARN to deduce region and account from. 
     */
    public fun environmentFromArn(environmentFromArn: String)

    /**
     * The value passed in by users to the physical name prop of the resource.
     *
     * * `undefined` implies that a physical name will be allocated by
     * CloudFormation during deployment.
     * * a concrete value implies a specific physical name
     * * `PhysicalName.GENERATE_IF_NEEDED` is a marker that indicates that a physical will only be
     * generated
     * by the CDK if it is needed for cross-environment references. Otherwise, it will be allocated
     * by CloudFormation.
     *
     * Default: - The physical name will be allocated by CloudFormation at deployment time
     *
     * @param physicalName The value passed in by users to the physical name prop of the resource. 
     */
    public fun physicalName(physicalName: String)

    /**
     * The AWS region this resource belongs to.
     *
     * Default: - the resource is in the same region as the stack it belongs to
     *
     * @param region The AWS region this resource belongs to. 
     */
    public fun region(region: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.inspector.AssessmentTemplate.Builder =
        software.amazon.awscdk.services.inspector.AssessmentTemplate.Builder.create(scope, id)

    /**
     * The AWS account ID this resource belongs to.
     *
     * Default: - the resource is in the same account as the stack it belongs to
     *
     * @param account The AWS account ID this resource belongs to. 
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * ARN to deduce region and account from.
     *
     * The ARN is parsed and the account and region are taken from the ARN.
     * This should be used for imported resources.
     *
     * Cannot be supplied together with either `account` or `region`.
     *
     * Default: - take environment from `account`, `region` parameters, or use Stack environment.
     *
     * @param environmentFromArn ARN to deduce region and account from. 
     */
    override fun environmentFromArn(environmentFromArn: String) {
      cdkBuilder.environmentFromArn(environmentFromArn)
    }

    /**
     * The value passed in by users to the physical name prop of the resource.
     *
     * * `undefined` implies that a physical name will be allocated by
     * CloudFormation during deployment.
     * * a concrete value implies a specific physical name
     * * `PhysicalName.GENERATE_IF_NEEDED` is a marker that indicates that a physical will only be
     * generated
     * by the CDK if it is needed for cross-environment references. Otherwise, it will be allocated
     * by CloudFormation.
     *
     * Default: - The physical name will be allocated by CloudFormation at deployment time
     *
     * @param physicalName The value passed in by users to the physical name prop of the resource. 
     */
    override fun physicalName(physicalName: String) {
      cdkBuilder.physicalName(physicalName)
    }

    /**
     * The AWS region this resource belongs to.
     *
     * Default: - the resource is in the same region as the stack it belongs to
     *
     * @param region The AWS region this resource belongs to. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.services.inspector.AssessmentTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.inspector.AssessmentTemplate.PROPERTY_INJECTION_ID

    public fun fromCfnAssessmentTemplate(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      template: CfnAssessmentTemplate,
    ): IAssessmentTemplate =
        software.amazon.awscdk.services.inspector.AssessmentTemplate.fromCfnAssessmentTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, template.let(CfnAssessmentTemplate.Companion::unwrap)).let(IAssessmentTemplate::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AssessmentTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AssessmentTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.inspector.AssessmentTemplate):
        AssessmentTemplate = AssessmentTemplate(cdkObject)

    internal fun unwrap(wrapped: AssessmentTemplate):
        software.amazon.awscdk.services.inspector.AssessmentTemplate = wrapped.cdkObject as
        software.amazon.awscdk.services.inspector.AssessmentTemplate
  }
}
