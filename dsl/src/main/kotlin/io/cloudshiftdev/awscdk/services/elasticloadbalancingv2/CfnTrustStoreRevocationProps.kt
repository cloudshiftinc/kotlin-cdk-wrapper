package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTrustStoreRevocationProps {
  /**
   * The revocation file to add.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontents)
   */
  public fun revocationContents(): Any? = unwrap(this).getRevocationContents()

  /**
   * The Amazon Resource Name (ARN) of the trust store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-truststorearn)
   */
  public fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()

  /**
   * A builder for [CfnTrustStoreRevocationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param revocationContents The revocation file to add.
     */
    public fun revocationContents(revocationContents: IResolvable)

    /**
     * @param revocationContents The revocation file to add.
     */
    public fun revocationContents(revocationContents: List<Any>)

    /**
     * @param revocationContents The revocation file to add.
     */
    public fun revocationContents(vararg revocationContents: Any)

    /**
     * @param trustStoreArn The Amazon Resource Name (ARN) of the trust store.
     */
    public fun trustStoreArn(trustStoreArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocationProps.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocationProps.builder()

    /**
     * @param revocationContents The revocation file to add.
     */
    override fun revocationContents(revocationContents: IResolvable) {
      cdkBuilder.revocationContents(revocationContents.let(IResolvable::unwrap))
    }

    /**
     * @param revocationContents The revocation file to add.
     */
    override fun revocationContents(revocationContents: List<Any>) {
      cdkBuilder.revocationContents(revocationContents)
    }

    /**
     * @param revocationContents The revocation file to add.
     */
    override fun revocationContents(vararg revocationContents: Any): Unit =
        revocationContents(revocationContents.toList())

    /**
     * @param trustStoreArn The Amazon Resource Name (ARN) of the trust store.
     */
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
    /**
     * The revocation file to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontents)
     */
    override fun revocationContents(): Any? = unwrap(this).getRevocationContents()

    /**
     * The Amazon Resource Name (ARN) of the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-truststorearn)
     */
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
