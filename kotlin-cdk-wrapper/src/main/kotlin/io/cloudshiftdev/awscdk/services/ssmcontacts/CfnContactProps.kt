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
 * Properties for defining a `CfnContact`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
 * CfnContactProps cfnContactProps = CfnContactProps.builder()
 * .alias("alias")
 * .displayName("displayName")
 * .type("type")
 * // the properties below are optional
 * .plan(List.of(StageProperty.builder()
 * .durationInMinutes(123)
 * .rotationIds(List.of("rotationIds"))
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html)
 */
public interface CfnContactProps {
  /**
   * The unique and identifiable alias of the contact or escalation plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-alias)
   */
  public fun alias(): String

  /**
   * The full name of the contact or escalation plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-displayname)
   */
  public fun displayName(): String

  /**
   * A list of stages.
   *
   * A contact has an engagement plan with stages that contact specified contact channels. An
   * escalation plan uses stages that contact specified contacts.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-plan)
   */
  public fun plan(): Any? = unwrap(this).getPlan()

  /**
   * The type of contact.
   *
   * * `PERSONAL` : A single, individual contact.
   * * `ESCALATION` : An escalation plan.
   * * `ONCALL_SCHEDULE` : An on-call schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnContactProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alias The unique and identifiable alias of the contact or escalation plan. 
     */
    public fun alias(alias: String)

    /**
     * @param displayName The full name of the contact or escalation plan. 
     */
    public fun displayName(displayName: String)

    /**
     * @param plan A list of stages.
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     */
    public fun plan(plan: IResolvable)

    /**
     * @param plan A list of stages.
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     */
    public fun plan(plan: List<Any>)

    /**
     * @param plan A list of stages.
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     */
    public fun plan(vararg plan: Any)

    /**
     * @param type The type of contact. 
     * * `PERSONAL` : A single, individual contact.
     * * `ESCALATION` : An escalation plan.
     * * `ONCALL_SCHEDULE` : An on-call schedule.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmcontacts.CfnContactProps.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnContactProps.builder()

    /**
     * @param alias The unique and identifiable alias of the contact or escalation plan. 
     */
    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    /**
     * @param displayName The full name of the contact or escalation plan. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param plan A list of stages.
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     */
    override fun plan(plan: IResolvable) {
      cdkBuilder.plan(plan.let(IResolvable::unwrap))
    }

    /**
     * @param plan A list of stages.
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     */
    override fun plan(plan: List<Any>) {
      cdkBuilder.plan(plan.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param plan A list of stages.
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     */
    override fun plan(vararg plan: Any): Unit = plan(plan.toList())

    /**
     * @param type The type of contact. 
     * * `PERSONAL` : A single, individual contact.
     * * `ESCALATION` : An escalation plan.
     * * `ONCALL_SCHEDULE` : An on-call schedule.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnContactProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContactProps,
  ) : CdkObject(cdkObject), CfnContactProps {
    /**
     * The unique and identifiable alias of the contact or escalation plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-alias)
     */
    override fun alias(): String = unwrap(this).getAlias()

    /**
     * The full name of the contact or escalation plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * A list of stages.
     *
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-plan)
     */
    override fun plan(): Any? = unwrap(this).getPlan()

    /**
     * The type of contact.
     *
     * * `PERSONAL` : A single, individual contact.
     * * `ESCALATION` : An escalation plan.
     * * `ONCALL_SCHEDULE` : An on-call schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContactProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContactProps):
        CfnContactProps = CdkObjectWrappers.wrap(cdkObject) as? CfnContactProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContactProps):
        software.amazon.awscdk.services.ssmcontacts.CfnContactProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssmcontacts.CfnContactProps
  }
}
