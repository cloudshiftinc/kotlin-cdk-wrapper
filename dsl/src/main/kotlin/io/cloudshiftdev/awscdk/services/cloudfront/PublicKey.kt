package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class PublicKey internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.PublicKey,
) : Resource(cdkObject), IPublicKey {
  public override fun publicKeyId(): String = unwrap(this).getPublicKeyId()

  public interface Builder {
    public fun comment(comment: String)

    public fun encodedKey(encodedKey: String)

    public fun publicKeyName(publicKeyName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.PublicKey.Builder =
        software.amazon.awscdk.services.cloudfront.PublicKey.Builder.create(scope, id)

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun encodedKey(encodedKey: String) {
      cdkBuilder.encodedKey(encodedKey)
    }

    override fun publicKeyName(publicKeyName: String) {
      cdkBuilder.publicKeyName(publicKeyName)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.PublicKey = cdkBuilder.build()
  }

  public companion object {
    public open fun fromPublicKeyId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      publicKeyId: String,
    ): IPublicKey =
        software.amazon.awscdk.services.cloudfront.PublicKey.fromPublicKeyId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, publicKeyId).let(IPublicKey::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PublicKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PublicKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.PublicKey): PublicKey =
        PublicKey(cdkObject)

    internal fun unwrap(wrapped: PublicKey): software.amazon.awscdk.services.cloudfront.PublicKey =
        wrapped.cdkObject
  }
}
