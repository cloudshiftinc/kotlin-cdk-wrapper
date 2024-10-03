@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A new Trust Store Revocation.
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
public open class TrustStoreRevocation(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocation,
) : Resource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TrustStoreRevocationProps,
  ) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(TrustStoreRevocationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TrustStoreRevocationProps.Builder.() -> Unit,
  ) : this(scope, id, TrustStoreRevocationProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.TrustStoreRevocation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The revocation file to add.
     *
     * @param revocationContents The revocation file to add. 
     */
    public fun revocationContents(revocationContents: List<RevocationContent>)

    /**
     * The revocation file to add.
     *
     * @param revocationContents The revocation file to add. 
     */
    public fun revocationContents(vararg revocationContents: RevocationContent)

    /**
     * The trust store.
     *
     * @param trustStore The trust store. 
     */
    public fun trustStore(trustStore: ITrustStore)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocation.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocation.Builder.create(scope,
        id)

    /**
     * The revocation file to add.
     *
     * @param revocationContents The revocation file to add. 
     */
    override fun revocationContents(revocationContents: List<RevocationContent>) {
      cdkBuilder.revocationContents(revocationContents.map(RevocationContent.Companion::unwrap))
    }

    /**
     * The revocation file to add.
     *
     * @param revocationContents The revocation file to add. 
     */
    override fun revocationContents(vararg revocationContents: RevocationContent): Unit =
        revocationContents(revocationContents.toList())

    /**
     * The trust store.
     *
     * @param trustStore The trust store. 
     */
    override fun trustStore(trustStore: ITrustStore) {
      cdkBuilder.trustStore(trustStore.let(ITrustStore.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocation
        = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): TrustStoreRevocation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return TrustStoreRevocation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocation):
        TrustStoreRevocation = TrustStoreRevocation(cdkObject)

    internal fun unwrap(wrapped: TrustStoreRevocation):
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocation =
        wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocation
  }
}
