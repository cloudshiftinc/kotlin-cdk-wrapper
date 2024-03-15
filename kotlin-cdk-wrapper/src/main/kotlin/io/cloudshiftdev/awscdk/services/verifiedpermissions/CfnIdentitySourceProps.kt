@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.verifiedpermissions

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnIdentitySourceProps {
  public fun configuration(): Any

  public fun policyStoreId(): String

  public fun principalEntityType(): String? = unwrap(this).getPrincipalEntityType()

  @CdkDslMarker
  public interface Builder {
    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: CfnIdentitySource.IdentitySourceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b629a9e57b120a7a975fd1c6bbec319e646a4f38b1564a226380c164c79c8c2f")
    public
        fun configuration(configuration: CfnIdentitySource.IdentitySourceConfigurationProperty.Builder.() -> Unit)

    public fun policyStoreId(policyStoreId: String)

    public fun principalEntityType(principalEntityType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps.Builder =
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps.builder()

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override
        fun configuration(configuration: CfnIdentitySource.IdentitySourceConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnIdentitySource.IdentitySourceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b629a9e57b120a7a975fd1c6bbec319e646a4f38b1564a226380c164c79c8c2f")
    override
        fun configuration(configuration: CfnIdentitySource.IdentitySourceConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnIdentitySource.IdentitySourceConfigurationProperty(configuration))

    override fun policyStoreId(policyStoreId: String) {
      cdkBuilder.policyStoreId(policyStoreId)
    }

    override fun principalEntityType(principalEntityType: String) {
      cdkBuilder.principalEntityType(principalEntityType)
    }

    public fun build(): software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps,
  ) : CdkObject(cdkObject), CfnIdentitySourceProps {
    override fun configuration(): Any = unwrap(this).getConfiguration()

    override fun policyStoreId(): String = unwrap(this).getPolicyStoreId()

    override fun principalEntityType(): String? = unwrap(this).getPrincipalEntityType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdentitySourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps):
        CfnIdentitySourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdentitySourceProps):
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps
  }
}
