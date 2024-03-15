@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnReceiptRuleSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnReceiptRuleSetProps cfnReceiptRuleSetProps = CfnReceiptRuleSetProps.builder()
 * .ruleSetName("ruleSetName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html)
 */
public interface CfnReceiptRuleSetProps {
  /**
   * The name of the receipt rule set to reorder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html#cfn-ses-receiptruleset-rulesetname)
   */
  public fun ruleSetName(): String? = unwrap(this).getRuleSetName()

  /**
   * A builder for [CfnReceiptRuleSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ruleSetName The name of the receipt rule set to reorder.
     */
    public fun ruleSetName(ruleSetName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps.Builder =
        software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps.builder()

    /**
     * @param ruleSetName The name of the receipt rule set to reorder.
     */
    override fun ruleSetName(ruleSetName: String) {
      cdkBuilder.ruleSetName(ruleSetName)
    }

    public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps,
  ) : CdkObject(cdkObject), CfnReceiptRuleSetProps {
    /**
     * The name of the receipt rule set to reorder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html#cfn-ses-receiptruleset-rulesetname)
     */
    override fun ruleSetName(): String? = unwrap(this).getRuleSetName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReceiptRuleSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps):
        CfnReceiptRuleSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReceiptRuleSetProps):
        software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps
  }
}
