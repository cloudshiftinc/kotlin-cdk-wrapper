@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnReceiptRuleSetProps {
  public fun ruleSetName(): String? = unwrap(this).getRuleSetName()

  @CdkDslMarker
  public interface Builder {
    public fun ruleSetName(ruleSetName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps.Builder =
        software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps.builder()

    override fun ruleSetName(ruleSetName: String) {
      cdkBuilder.ruleSetName(ruleSetName)
    }

    public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps,
  ) : CdkObject(cdkObject), CfnReceiptRuleSetProps {
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
