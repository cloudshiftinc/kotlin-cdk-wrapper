@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnResourcePolicyProps {
  public fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

  public fun resourcePolicy(): Any

  public fun secretId(): String

  @CdkDslMarker
  public interface Builder {
    public fun blockPublicPolicy(blockPublicPolicy: Boolean)

    public fun blockPublicPolicy(blockPublicPolicy: IResolvable)

    public fun resourcePolicy(resourcePolicy: Any)

    public fun secretId(secretId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps.Builder =
        software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps.builder()

    override fun blockPublicPolicy(blockPublicPolicy: Boolean) {
      cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    override fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
      cdkBuilder.blockPublicPolicy(blockPublicPolicy.let(IResolvable::unwrap))
    }

    override fun resourcePolicy(resourcePolicy: Any) {
      cdkBuilder.resourcePolicy(resourcePolicy)
    }

    override fun secretId(secretId: String) {
      cdkBuilder.secretId(secretId)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps,
  ) : CdkObject(cdkObject), CfnResourcePolicyProps {
    override fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

    override fun resourcePolicy(): Any = unwrap(this).getResourcePolicy()

    override fun secretId(): String = unwrap(this).getSecretId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps):
        CfnResourcePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicyProps):
        software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps
  }
}
