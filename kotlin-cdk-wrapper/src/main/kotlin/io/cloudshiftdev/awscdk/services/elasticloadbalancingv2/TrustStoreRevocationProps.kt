@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for the trust store revocation.
 *
 * Example:
 *
 * ```
 * TrustStore trustStore;
 * Bucket bucket;
 * TrustStoreRevocation.Builder.create(this, "Revocation")
 * .trustStore(trustStore)
 * .revocationContents(List.of(RevocationContent.builder()
 * .revocationType(RevocationType.CRL)
 * .bucket(bucket)
 * .key("crl.pem")
 * .build()))
 * .build();
 * ```
 */
public interface TrustStoreRevocationProps {
  /**
   * The revocation file to add.
   */
  public fun revocationContents(): List<RevocationContent>

  /**
   * The trust store.
   */
  public fun trustStore(): ITrustStore

  /**
   * A builder for [TrustStoreRevocationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param revocationContents The revocation file to add. 
     */
    public fun revocationContents(revocationContents: List<RevocationContent>)

    /**
     * @param revocationContents The revocation file to add. 
     */
    public fun revocationContents(vararg revocationContents: RevocationContent)

    /**
     * @param trustStore The trust store. 
     */
    public fun trustStore(trustStore: ITrustStore)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocationProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocationProps.builder()

    /**
     * @param revocationContents The revocation file to add. 
     */
    override fun revocationContents(revocationContents: List<RevocationContent>) {
      cdkBuilder.revocationContents(revocationContents.map(RevocationContent.Companion::unwrap))
    }

    /**
     * @param revocationContents The revocation file to add. 
     */
    override fun revocationContents(vararg revocationContents: RevocationContent): Unit =
        revocationContents(revocationContents.toList())

    /**
     * @param trustStore The trust store. 
     */
    override fun trustStore(trustStore: ITrustStore) {
      cdkBuilder.trustStore(trustStore.let(ITrustStore.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocationProps,
  ) : CdkObject(cdkObject),
      TrustStoreRevocationProps {
    /**
     * The revocation file to add.
     */
    override fun revocationContents(): List<RevocationContent> =
        unwrap(this).getRevocationContents().map(RevocationContent::wrap)

    /**
     * The trust store.
     */
    override fun trustStore(): ITrustStore = unwrap(this).getTrustStore().let(ITrustStore::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TrustStoreRevocationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocationProps):
        TrustStoreRevocationProps = CdkObjectWrappers.wrap(cdkObject) as? TrustStoreRevocationProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TrustStoreRevocationProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocationProps
  }
}
