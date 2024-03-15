@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCollaborationProps {
  public fun creatorDisplayName(): String

  public fun creatorMemberAbilities(): List<String>

  public fun creatorPaymentConfiguration(): Any? = unwrap(this).getCreatorPaymentConfiguration()

  public fun dataEncryptionMetadata(): Any? = unwrap(this).getDataEncryptionMetadata()

  public fun description(): String

  public fun members(): Any

  public fun name(): String

  public fun queryLogStatus(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun creatorDisplayName(creatorDisplayName: String)

    public fun creatorMemberAbilities(creatorMemberAbilities: List<String>)

    public fun creatorMemberAbilities(vararg creatorMemberAbilities: String)

    public fun creatorPaymentConfiguration(creatorPaymentConfiguration: IResolvable)

    public
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: CfnCollaboration.PaymentConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33da896b017094c5a39cedde484ca720ff659b36909a615f8111b997422befc4")
    public
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: CfnCollaboration.PaymentConfigurationProperty.Builder.() -> Unit)

    public fun dataEncryptionMetadata(dataEncryptionMetadata: IResolvable)

    public
        fun dataEncryptionMetadata(dataEncryptionMetadata: CfnCollaboration.DataEncryptionMetadataProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("deb309635685efd6c3434160760e8cff2f8c1f0be32fd321b989145b848a2824")
    public
        fun dataEncryptionMetadata(dataEncryptionMetadata: CfnCollaboration.DataEncryptionMetadataProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun members(members: IResolvable)

    public fun members(members: List<Any>)

    public fun members(vararg members: Any)

    public fun name(name: String)

    public fun queryLogStatus(queryLogStatus: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps.Builder
        = software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps.builder()

    override fun creatorDisplayName(creatorDisplayName: String) {
      cdkBuilder.creatorDisplayName(creatorDisplayName)
    }

    override fun creatorMemberAbilities(creatorMemberAbilities: List<String>) {
      cdkBuilder.creatorMemberAbilities(creatorMemberAbilities)
    }

    override fun creatorMemberAbilities(vararg creatorMemberAbilities: String): Unit =
        creatorMemberAbilities(creatorMemberAbilities.toList())

    override fun creatorPaymentConfiguration(creatorPaymentConfiguration: IResolvable) {
      cdkBuilder.creatorPaymentConfiguration(creatorPaymentConfiguration.let(IResolvable::unwrap))
    }

    override
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: CfnCollaboration.PaymentConfigurationProperty) {
      cdkBuilder.creatorPaymentConfiguration(creatorPaymentConfiguration.let(CfnCollaboration.PaymentConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33da896b017094c5a39cedde484ca720ff659b36909a615f8111b997422befc4")
    override
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: CfnCollaboration.PaymentConfigurationProperty.Builder.() -> Unit):
        Unit =
        creatorPaymentConfiguration(CfnCollaboration.PaymentConfigurationProperty(creatorPaymentConfiguration))

    override fun dataEncryptionMetadata(dataEncryptionMetadata: IResolvable) {
      cdkBuilder.dataEncryptionMetadata(dataEncryptionMetadata.let(IResolvable::unwrap))
    }

    override
        fun dataEncryptionMetadata(dataEncryptionMetadata: CfnCollaboration.DataEncryptionMetadataProperty) {
      cdkBuilder.dataEncryptionMetadata(dataEncryptionMetadata.let(CfnCollaboration.DataEncryptionMetadataProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("deb309635685efd6c3434160760e8cff2f8c1f0be32fd321b989145b848a2824")
    override
        fun dataEncryptionMetadata(dataEncryptionMetadata: CfnCollaboration.DataEncryptionMetadataProperty.Builder.() -> Unit):
        Unit =
        dataEncryptionMetadata(CfnCollaboration.DataEncryptionMetadataProperty(dataEncryptionMetadata))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun members(members: IResolvable) {
      cdkBuilder.members(members.let(IResolvable::unwrap))
    }

    override fun members(members: List<Any>) {
      cdkBuilder.members(members)
    }

    override fun members(vararg members: Any): Unit = members(members.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun queryLogStatus(queryLogStatus: String) {
      cdkBuilder.queryLogStatus(queryLogStatus)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps,
  ) : CdkObject(cdkObject), CfnCollaborationProps {
    override fun creatorDisplayName(): String = unwrap(this).getCreatorDisplayName()

    override fun creatorMemberAbilities(): List<String> = unwrap(this).getCreatorMemberAbilities()

    override fun creatorPaymentConfiguration(): Any? = unwrap(this).getCreatorPaymentConfiguration()

    override fun dataEncryptionMetadata(): Any? = unwrap(this).getDataEncryptionMetadata()

    override fun description(): String = unwrap(this).getDescription()

    override fun members(): Any = unwrap(this).getMembers()

    override fun name(): String = unwrap(this).getName()

    override fun queryLogStatus(): String = unwrap(this).getQueryLogStatus()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCollaborationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps):
        CfnCollaborationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCollaborationProps):
        software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps
  }
}
