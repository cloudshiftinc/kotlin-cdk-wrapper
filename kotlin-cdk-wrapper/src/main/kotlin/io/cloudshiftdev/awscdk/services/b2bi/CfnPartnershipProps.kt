@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.b2bi

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPartnershipProps {
  public fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

  public fun email(): String

  public fun name(): String

  public fun phone(): String? = unwrap(this).getPhone()

  public fun profileId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun capabilities(capabilities: List<String>)

    public fun capabilities(vararg capabilities: String)

    public fun email(email: String)

    public fun name(name: String)

    public fun phone(phone: String)

    public fun profileId(profileId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnPartnershipProps.Builder =
        software.amazon.awscdk.services.b2bi.CfnPartnershipProps.builder()

    override fun capabilities(capabilities: List<String>) {
      cdkBuilder.capabilities(capabilities)
    }

    override fun capabilities(vararg capabilities: String): Unit =
        capabilities(capabilities.toList())

    override fun email(email: String) {
      cdkBuilder.email(email)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun phone(phone: String) {
      cdkBuilder.phone(phone)
    }

    override fun profileId(profileId: String) {
      cdkBuilder.profileId(profileId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.b2bi.CfnPartnershipProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnershipProps,
  ) : CdkObject(cdkObject), CfnPartnershipProps {
    override fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

    override fun email(): String = unwrap(this).getEmail()

    override fun name(): String = unwrap(this).getName()

    override fun phone(): String? = unwrap(this).getPhone()

    override fun profileId(): String = unwrap(this).getProfileId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPartnershipProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnershipProps):
        CfnPartnershipProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPartnershipProps):
        software.amazon.awscdk.services.b2bi.CfnPartnershipProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.b2bi.CfnPartnershipProps
  }
}
