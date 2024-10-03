@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an empty receipt rule set.
 *
 * For information about setting up receipt rule sets, see the [Amazon SES Developer
 * Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html#receiving-email-concepts-rules)
 * .
 *
 * You can execute this operation no more than once per second.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnReceiptRuleSet cfnReceiptRuleSet = CfnReceiptRuleSet.Builder.create(this,
 * "MyCfnReceiptRuleSet")
 * .ruleSetName("ruleSetName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html)
 */
public open class CfnReceiptRuleSet(
  cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRuleSet,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ses.CfnReceiptRuleSet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReceiptRuleSetProps,
  ) :
      this(software.amazon.awscdk.services.ses.CfnReceiptRuleSet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnReceiptRuleSetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReceiptRuleSetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnReceiptRuleSetProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the receipt rule set to make active.
   */
  public open fun ruleSetName(): String? = unwrap(this).getRuleSetName()

  /**
   * The name of the receipt rule set to make active.
   */
  public open fun ruleSetName(`value`: String) {
    unwrap(this).setRuleSetName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnReceiptRuleSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the receipt rule set to make active.
     *
     * Setting this value to null disables all email receiving.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html#cfn-ses-receiptruleset-rulesetname)
     * @param ruleSetName The name of the receipt rule set to make active. 
     */
    public fun ruleSetName(ruleSetName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnReceiptRuleSet.Builder =
        software.amazon.awscdk.services.ses.CfnReceiptRuleSet.Builder.create(scope, id)

    /**
     * The name of the receipt rule set to make active.
     *
     * Setting this value to null disables all email receiving.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html#cfn-ses-receiptruleset-rulesetname)
     * @param ruleSetName The name of the receipt rule set to make active. 
     */
    override fun ruleSetName(ruleSetName: String) {
      cdkBuilder.ruleSetName(ruleSetName)
    }

    public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRuleSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnReceiptRuleSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReceiptRuleSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReceiptRuleSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRuleSet):
        CfnReceiptRuleSet = CfnReceiptRuleSet(cdkObject)

    internal fun unwrap(wrapped: CfnReceiptRuleSet):
        software.amazon.awscdk.services.ses.CfnReceiptRuleSet = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.CfnReceiptRuleSet
  }
}
