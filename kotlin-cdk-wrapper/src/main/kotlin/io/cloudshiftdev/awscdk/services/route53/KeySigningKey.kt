@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Key Signing Key for a Route 53 Hosted Zone.
 *
 * Example:
 *
 * ```
 * HostedZone hostedZone;
 * Key kmsKey;
 * KeySigningKey.Builder.create(this, "KeySigningKey")
 * .hostedZone(hostedZone)
 * .kmsKey(kmsKey)
 * .keySigningKeyName("ksk")
 * .status(KeySigningKeyStatus.ACTIVE)
 * .build();
 * ```
 */
public open class KeySigningKey(
  cdkObject: software.amazon.awscdk.services.route53.KeySigningKey,
) : Resource(cdkObject), IKeySigningKey {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: KeySigningKeyProps,
  ) :
      this(software.amazon.awscdk.services.route53.KeySigningKey(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(KeySigningKeyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: KeySigningKeyProps.Builder.() -> Unit,
  ) : this(scope, id, KeySigningKeyProps(props)
  )

  /**
   * The hosted zone that the key signing key signs.
   */
  public override fun hostedZone(): IHostedZone =
      unwrap(this).getHostedZone().let(IHostedZone::wrap)

  /**
   * The ID of the key signing key, derived from the hosted zone ID and its name.
   */
  public override fun keySigningKeyId(): String = unwrap(this).getKeySigningKeyId()

  /**
   * The name of the key signing key.
   */
  public override fun keySigningKeyName(): String = unwrap(this).getKeySigningKeyName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53.KeySigningKey].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The hosted zone that this key will be used to sign.
     *
     * @param hostedZone The hosted zone that this key will be used to sign. 
     */
    public fun hostedZone(hostedZone: IHostedZone)

    /**
     * The name for the key signing key.
     *
     * This name must be unique within a hosted zone.
     *
     * Default: an autogenerated name
     *
     * @param keySigningKeyName The name for the key signing key. 
     */
    public fun keySigningKeyName(keySigningKeyName: String)

    /**
     * The customer-managed KMS key that that will be used to sign the records.
     *
     * The KMS Key must be unique for each KSK within a hosted zone. Additionally, the
     * KMS key must be an asymetric customer-managed key using the ECC_NIST_P256 algorithm.
     *
     * [Documentation](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html)
     * @param kmsKey The customer-managed KMS key that that will be used to sign the records. 
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * The status of the key signing key.
     *
     * Default: ACTIVE
     *
     * @param status The status of the key signing key. 
     */
    public fun status(status: KeySigningKeyStatus)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.KeySigningKey.Builder =
        software.amazon.awscdk.services.route53.KeySigningKey.Builder.create(scope, id)

    /**
     * The hosted zone that this key will be used to sign.
     *
     * @param hostedZone The hosted zone that this key will be used to sign. 
     */
    override fun hostedZone(hostedZone: IHostedZone) {
      cdkBuilder.hostedZone(hostedZone.let(IHostedZone::unwrap))
    }

    /**
     * The name for the key signing key.
     *
     * This name must be unique within a hosted zone.
     *
     * Default: an autogenerated name
     *
     * @param keySigningKeyName The name for the key signing key. 
     */
    override fun keySigningKeyName(keySigningKeyName: String) {
      cdkBuilder.keySigningKeyName(keySigningKeyName)
    }

    /**
     * The customer-managed KMS key that that will be used to sign the records.
     *
     * The KMS Key must be unique for each KSK within a hosted zone. Additionally, the
     * KMS key must be an asymetric customer-managed key using the ECC_NIST_P256 algorithm.
     *
     * [Documentation](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html)
     * @param kmsKey The customer-managed KMS key that that will be used to sign the records. 
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    /**
     * The status of the key signing key.
     *
     * Default: ACTIVE
     *
     * @param status The status of the key signing key. 
     */
    override fun status(status: KeySigningKeyStatus) {
      cdkBuilder.status(status.let(KeySigningKeyStatus::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.KeySigningKey = cdkBuilder.build()
  }

  public companion object {
    public fun fromKeySigningKeyAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: KeySigningKeyAttributes,
    ): IKeySigningKey =
        software.amazon.awscdk.services.route53.KeySigningKey.fromKeySigningKeyAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(KeySigningKeyAttributes::unwrap)).let(IKeySigningKey::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75826e30a29d75b033f852519279dba732ef46c4cc824e4b69e8db313453e4f9")
    public fun fromKeySigningKeyAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: KeySigningKeyAttributes.Builder.() -> Unit,
    ): IKeySigningKey = fromKeySigningKeyAttributes(scope, id, KeySigningKeyAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): KeySigningKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return KeySigningKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.KeySigningKey):
        KeySigningKey = KeySigningKey(cdkObject)

    internal fun unwrap(wrapped: KeySigningKey):
        software.amazon.awscdk.services.route53.KeySigningKey = wrapped.cdkObject as
        software.amazon.awscdk.services.route53.KeySigningKey
  }
}