@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.verifiedpermissions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnPolicyTemplateProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun policyStoreId(): String

  public fun statement(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun policyStoreId(policyStoreId: String)

    public fun statement(statement: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps.Builder =
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun policyStoreId(policyStoreId: String) {
      cdkBuilder.policyStoreId(policyStoreId)
    }

    override fun statement(statement: String) {
      cdkBuilder.statement(statement)
    }

    public fun build(): software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps,
  ) : CdkObject(cdkObject), CfnPolicyTemplateProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun policyStoreId(): String = unwrap(this).getPolicyStoreId()

    override fun statement(): String = unwrap(this).getStatement()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps):
        CfnPolicyTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyTemplateProps):
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps
  }
}
