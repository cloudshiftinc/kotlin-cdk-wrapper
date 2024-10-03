@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmcontacts

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPlan`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
 * CfnPlanProps cfnPlanProps = CfnPlanProps.builder()
 * .contactId("contactId")
 * // the properties below are optional
 * .rotationIds(List.of("rotationIds"))
 * .stages(List.of(StageProperty.builder()
 * .durationInMinutes(123)
 * // the properties below are optional
 * .targets(List.of(TargetsProperty.builder()
 * .channelTargetInfo(ChannelTargetInfoProperty.builder()
 * .channelId("channelId")
 * .retryIntervalInMinutes(123)
 * .build())
 * .contactTargetInfo(ContactTargetInfoProperty.builder()
 * .contactId("contactId")
 * .isEssential(false)
 * .build())
 * .build()))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html)
 */
public interface CfnPlanProps {
  /**
   * The Amazon Resource Name (ARN) of the contact.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-contactid)
   */
  public fun contactId(): String

  /**
   * The Amazon Resource Names (ARNs) of the on-call rotations associated with the plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-rotationids)
   */
  public fun rotationIds(): List<String> = unwrap(this).getRotationIds() ?: emptyList()

  /**
   * A list of stages that the escalation plan or engagement plan uses to engage contacts and
   * contact methods.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-stages)
   */
  public fun stages(): Any? = unwrap(this).getStages()

  /**
   * A builder for [CfnPlanProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contactId The Amazon Resource Name (ARN) of the contact. 
     */
    public fun contactId(contactId: String)

    /**
     * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated with
     * the plan.
     */
    public fun rotationIds(rotationIds: List<String>)

    /**
     * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated with
     * the plan.
     */
    public fun rotationIds(vararg rotationIds: String)

    /**
     * @param stages A list of stages that the escalation plan or engagement plan uses to engage
     * contacts and contact methods.
     */
    public fun stages(stages: IResolvable)

    /**
     * @param stages A list of stages that the escalation plan or engagement plan uses to engage
     * contacts and contact methods.
     */
    public fun stages(stages: List<Any>)

    /**
     * @param stages A list of stages that the escalation plan or engagement plan uses to engage
     * contacts and contact methods.
     */
    public fun stages(vararg stages: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmcontacts.CfnPlanProps.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnPlanProps.builder()

    /**
     * @param contactId The Amazon Resource Name (ARN) of the contact. 
     */
    override fun contactId(contactId: String) {
      cdkBuilder.contactId(contactId)
    }

    /**
     * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated with
     * the plan.
     */
    override fun rotationIds(rotationIds: List<String>) {
      cdkBuilder.rotationIds(rotationIds)
    }

    /**
     * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated with
     * the plan.
     */
    override fun rotationIds(vararg rotationIds: String): Unit = rotationIds(rotationIds.toList())

    /**
     * @param stages A list of stages that the escalation plan or engagement plan uses to engage
     * contacts and contact methods.
     */
    override fun stages(stages: IResolvable) {
      cdkBuilder.stages(stages.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param stages A list of stages that the escalation plan or engagement plan uses to engage
     * contacts and contact methods.
     */
    override fun stages(stages: List<Any>) {
      cdkBuilder.stages(stages.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param stages A list of stages that the escalation plan or engagement plan uses to engage
     * contacts and contact methods.
     */
    override fun stages(vararg stages: Any): Unit = stages(stages.toList())

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnPlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlanProps,
  ) : CdkObject(cdkObject),
      CfnPlanProps {
    /**
     * The Amazon Resource Name (ARN) of the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-contactid)
     */
    override fun contactId(): String = unwrap(this).getContactId()

    /**
     * The Amazon Resource Names (ARNs) of the on-call rotations associated with the plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-rotationids)
     */
    override fun rotationIds(): List<String> = unwrap(this).getRotationIds() ?: emptyList()

    /**
     * A list of stages that the escalation plan or engagement plan uses to engage contacts and
     * contact methods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-stages)
     */
    override fun stages(): Any? = unwrap(this).getStages()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlanProps):
        CfnPlanProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPlanProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPlanProps):
        software.amazon.awscdk.services.ssmcontacts.CfnPlanProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ssmcontacts.CfnPlanProps
  }
}
