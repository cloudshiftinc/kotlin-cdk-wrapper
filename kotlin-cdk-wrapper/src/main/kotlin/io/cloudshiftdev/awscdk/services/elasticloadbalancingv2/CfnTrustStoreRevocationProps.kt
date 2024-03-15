@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTrustStoreRevocationProps {
  public fun revocationContents(): Any? = unwrap(this).getRevocationContents()

  public fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()

  @CdkDslMarker
  public interface Builder {
    public fun revocationContents(revocationContents: IResolvable)

    public fun revocationContents(revocationContents: List<Any>)

    public fun revocationContents(vararg revocationContents: Any)

    public fun trustStoreArn(trustStoreArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocationProps.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocationProps.builder()

    override fun revocationContents(revocationContents: IResolvable) {
      cdkBuilder.revocationContents(revocationContents.let(IResolvable::unwrap))
    }

    override fun revocationContents(revocationContents: List<Any>) {
      cdkBuilder.revocationContents(revocationContents)
    }

    override fun revocationContents(vararg revocationContents: Any): Unit =
        revocationContents(revocationContents.toList())

    override fun trustStoreArn(trustStoreArn: String) {
      cdkBuilder.trustStoreArn(trustStoreArn)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocationProps,
  ) : CdkObject(cdkObject), CfnTrustStoreRevocationProps {
    override fun revocationContents(): Any? = unwrap(this).getRevocationContents()

    override fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrustStoreRevocationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocationProps):
        CfnTrustStoreRevocationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrustStoreRevocationProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocationProps
  }
}
