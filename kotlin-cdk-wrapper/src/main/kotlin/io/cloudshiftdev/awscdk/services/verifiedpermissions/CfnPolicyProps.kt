@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.verifiedpermissions

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnPolicyProps {
  public fun definition(): Any

  public fun policyStoreId(): String

  @CdkDslMarker
  public interface Builder {
    public fun definition(definition: IResolvable)

    public fun definition(definition: CfnPolicy.PolicyDefinitionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d9e51d1cde055787749af96b99f58789b59e4fe6e5b5bb53f52711451a50217")
    public fun definition(definition: CfnPolicy.PolicyDefinitionProperty.Builder.() -> Unit)

    public fun policyStoreId(policyStoreId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps.Builder =
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps.builder()

    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    override fun definition(definition: CfnPolicy.PolicyDefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnPolicy.PolicyDefinitionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d9e51d1cde055787749af96b99f58789b59e4fe6e5b5bb53f52711451a50217")
    override fun definition(definition: CfnPolicy.PolicyDefinitionProperty.Builder.() -> Unit): Unit
        = definition(CfnPolicy.PolicyDefinitionProperty(definition))

    override fun policyStoreId(policyStoreId: String) {
      cdkBuilder.policyStoreId(policyStoreId)
    }

    public fun build(): software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps,
  ) : CdkObject(cdkObject), CfnPolicyProps {
    override fun definition(): Any = unwrap(this).getDefinition()

    override fun policyStoreId(): String = unwrap(this).getPolicyStoreId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps):
        CfnPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyProps):
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps
  }
}
