@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnSigningProfileProps {
  public fun platformId(): String

  public fun signatureValidityPeriod(): Any? = unwrap(this).getSignatureValidityPeriod()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun platformId(platformId: String)

    public fun signatureValidityPeriod(signatureValidityPeriod: IResolvable)

    public
        fun signatureValidityPeriod(signatureValidityPeriod: CfnSigningProfile.SignatureValidityPeriodProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04fd5c1330d5fc95523eacd0c7d05a88d15f20cb83f51757c828e0bed179c773")
    public
        fun signatureValidityPeriod(signatureValidityPeriod: CfnSigningProfile.SignatureValidityPeriodProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.signer.CfnSigningProfileProps.Builder =
        software.amazon.awscdk.services.signer.CfnSigningProfileProps.builder()

    override fun platformId(platformId: String) {
      cdkBuilder.platformId(platformId)
    }

    override fun signatureValidityPeriod(signatureValidityPeriod: IResolvable) {
      cdkBuilder.signatureValidityPeriod(signatureValidityPeriod.let(IResolvable::unwrap))
    }

    override
        fun signatureValidityPeriod(signatureValidityPeriod: CfnSigningProfile.SignatureValidityPeriodProperty) {
      cdkBuilder.signatureValidityPeriod(signatureValidityPeriod.let(CfnSigningProfile.SignatureValidityPeriodProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04fd5c1330d5fc95523eacd0c7d05a88d15f20cb83f51757c828e0bed179c773")
    override
        fun signatureValidityPeriod(signatureValidityPeriod: CfnSigningProfile.SignatureValidityPeriodProperty.Builder.() -> Unit):
        Unit =
        signatureValidityPeriod(CfnSigningProfile.SignatureValidityPeriodProperty(signatureValidityPeriod))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.signer.CfnSigningProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.signer.CfnSigningProfileProps,
  ) : CdkObject(cdkObject), CfnSigningProfileProps {
    override fun platformId(): String = unwrap(this).getPlatformId()

    override fun signatureValidityPeriod(): Any? = unwrap(this).getSignatureValidityPeriod()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSigningProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.CfnSigningProfileProps):
        CfnSigningProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSigningProfileProps):
        software.amazon.awscdk.services.signer.CfnSigningProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.signer.CfnSigningProfileProps
  }
}
