@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDomainProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun domainExecutionRole(): String

  public fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  public fun name(): String

  public fun singleSignOn(): Any? = unwrap(this).getSingleSignOn()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun domainExecutionRole(domainExecutionRole: String)

    public fun kmsKeyIdentifier(kmsKeyIdentifier: String)

    public fun name(name: String)

    public fun singleSignOn(singleSignOn: IResolvable)

    public fun singleSignOn(singleSignOn: CfnDomain.SingleSignOnProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("096e18de383c99db15658057a7afab9897b7ce96f7523dcefa5e6a2bb1df5ee0")
    public fun singleSignOn(singleSignOn: CfnDomain.SingleSignOnProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnDomainProps.Builder =
        software.amazon.awscdk.services.datazone.CfnDomainProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun domainExecutionRole(domainExecutionRole: String) {
      cdkBuilder.domainExecutionRole(domainExecutionRole)
    }

    override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
      cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun singleSignOn(singleSignOn: IResolvable) {
      cdkBuilder.singleSignOn(singleSignOn.let(IResolvable::unwrap))
    }

    override fun singleSignOn(singleSignOn: CfnDomain.SingleSignOnProperty) {
      cdkBuilder.singleSignOn(singleSignOn.let(CfnDomain.SingleSignOnProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("096e18de383c99db15658057a7afab9897b7ce96f7523dcefa5e6a2bb1df5ee0")
    override fun singleSignOn(singleSignOn: CfnDomain.SingleSignOnProperty.Builder.() -> Unit): Unit
        = singleSignOn(CfnDomain.SingleSignOnProperty(singleSignOn))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datazone.CfnDomainProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datazone.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun domainExecutionRole(): String = unwrap(this).getDomainExecutionRole()

    override fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

    override fun name(): String = unwrap(this).getName()

    override fun singleSignOn(): Any? = unwrap(this).getSingleSignOn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDomainProps):
        CfnDomainProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainProps):
        software.amazon.awscdk.services.datazone.CfnDomainProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.datazone.CfnDomainProps
  }
}
