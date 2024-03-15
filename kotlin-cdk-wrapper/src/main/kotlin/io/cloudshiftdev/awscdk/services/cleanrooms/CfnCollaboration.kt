@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCollaboration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCollaborationIdentifier(): String =
      unwrap(this).getAttrCollaborationIdentifier()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun creatorDisplayName(): String = unwrap(this).getCreatorDisplayName()

  public open fun creatorDisplayName(`value`: String) {
    unwrap(this).setCreatorDisplayName(`value`)
  }

  public open fun creatorMemberAbilities(): List<String> = unwrap(this).getCreatorMemberAbilities()

  public open fun creatorMemberAbilities(`value`: List<String>) {
    unwrap(this).setCreatorMemberAbilities(`value`)
  }

  public open fun creatorMemberAbilities(vararg `value`: String): Unit =
      creatorMemberAbilities(`value`.toList())

  public open fun creatorPaymentConfiguration(): Any? =
      unwrap(this).getCreatorPaymentConfiguration()

  public open fun creatorPaymentConfiguration(`value`: IResolvable) {
    unwrap(this).setCreatorPaymentConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun creatorPaymentConfiguration(`value`: PaymentConfigurationProperty) {
    unwrap(this).setCreatorPaymentConfiguration(`value`.let(PaymentConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8dbd986315571017bbf59c18cf58744e0cdcf02966530c18e1fc388fa546a854")
  public open
      fun creatorPaymentConfiguration(`value`: PaymentConfigurationProperty.Builder.() -> Unit):
      Unit = creatorPaymentConfiguration(PaymentConfigurationProperty(`value`))

  public open fun dataEncryptionMetadata(): Any? = unwrap(this).getDataEncryptionMetadata()

  public open fun dataEncryptionMetadata(`value`: IResolvable) {
    unwrap(this).setDataEncryptionMetadata(`value`.let(IResolvable::unwrap))
  }

  public open fun dataEncryptionMetadata(`value`: DataEncryptionMetadataProperty) {
    unwrap(this).setDataEncryptionMetadata(`value`.let(DataEncryptionMetadataProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ea0367267c811fc409a655638f5bb787a5f4d6bbbb1fb8df5aa3540fe088f11")
  public open
      fun dataEncryptionMetadata(`value`: DataEncryptionMetadataProperty.Builder.() -> Unit): Unit =
      dataEncryptionMetadata(DataEncryptionMetadataProperty(`value`))

  public open fun description(): String = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun members(): Any = unwrap(this).getMembers()

  public open fun members(`value`: IResolvable) {
    unwrap(this).setMembers(`value`.let(IResolvable::unwrap))
  }

  public open fun members(__idx_ac66f0: List<Any>) {
    unwrap(this).setMembers(__idx_ac66f0)
  }

  public open fun members(vararg __idx_ac66f0: Any): Unit = members(__idx_ac66f0.toList())

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun queryLogStatus(): String = unwrap(this).getQueryLogStatus()

  public open fun queryLogStatus(`value`: String) {
    unwrap(this).setQueryLogStatus(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun creatorDisplayName(creatorDisplayName: String)

    public fun creatorMemberAbilities(creatorMemberAbilities: List<String>)

    public fun creatorMemberAbilities(vararg creatorMemberAbilities: String)

    public fun creatorPaymentConfiguration(creatorPaymentConfiguration: IResolvable)

    public
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: PaymentConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9881ba8f65accaca98fab8be01e5349ad5c421b1be9fd1c5b2df4e9aa4006398")
    public
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: PaymentConfigurationProperty.Builder.() -> Unit)

    public fun dataEncryptionMetadata(dataEncryptionMetadata: IResolvable)

    public fun dataEncryptionMetadata(dataEncryptionMetadata: DataEncryptionMetadataProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("656599c92756a39c63decd3f4368484a397187171f0b4b32ea3e38ea82b5f7dd")
    public
        fun dataEncryptionMetadata(dataEncryptionMetadata: DataEncryptionMetadataProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun members(members: IResolvable)

    public fun members(members: List<Any>)

    public fun members(vararg members: Any)

    public fun name(name: String)

    public fun queryLogStatus(queryLogStatus: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cleanrooms.CfnCollaboration.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnCollaboration.Builder.create(scope, id)

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
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: PaymentConfigurationProperty) {
      cdkBuilder.creatorPaymentConfiguration(creatorPaymentConfiguration.let(PaymentConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9881ba8f65accaca98fab8be01e5349ad5c421b1be9fd1c5b2df4e9aa4006398")
    override
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: PaymentConfigurationProperty.Builder.() -> Unit):
        Unit =
        creatorPaymentConfiguration(PaymentConfigurationProperty(creatorPaymentConfiguration))

    override fun dataEncryptionMetadata(dataEncryptionMetadata: IResolvable) {
      cdkBuilder.dataEncryptionMetadata(dataEncryptionMetadata.let(IResolvable::unwrap))
    }

    override fun dataEncryptionMetadata(dataEncryptionMetadata: DataEncryptionMetadataProperty) {
      cdkBuilder.dataEncryptionMetadata(dataEncryptionMetadata.let(DataEncryptionMetadataProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("656599c92756a39c63decd3f4368484a397187171f0b4b32ea3e38ea82b5f7dd")
    override
        fun dataEncryptionMetadata(dataEncryptionMetadata: DataEncryptionMetadataProperty.Builder.() -> Unit):
        Unit = dataEncryptionMetadata(DataEncryptionMetadataProperty(dataEncryptionMetadata))

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

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnCollaboration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cleanrooms.CfnCollaboration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCollaboration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCollaboration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration):
        CfnCollaboration = CfnCollaboration(cdkObject)

    internal fun unwrap(wrapped: CfnCollaboration):
        software.amazon.awscdk.services.cleanrooms.CfnCollaboration = wrapped.cdkObject
  }

  public interface PaymentConfigurationProperty {
    public fun queryCompute(): Any

    @CdkDslMarker
    public interface Builder {
      public fun queryCompute(queryCompute: IResolvable)

      public fun queryCompute(queryCompute: QueryComputePaymentConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1619053f2bed07c05e5bf24c29eab5e69eae176b5c877da7734215b91901bed6")
      public fun queryCompute(queryCompute: QueryComputePaymentConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty.builder()

      override fun queryCompute(queryCompute: IResolvable) {
        cdkBuilder.queryCompute(queryCompute.let(IResolvable::unwrap))
      }

      override fun queryCompute(queryCompute: QueryComputePaymentConfigProperty) {
        cdkBuilder.queryCompute(queryCompute.let(QueryComputePaymentConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1619053f2bed07c05e5bf24c29eab5e69eae176b5c877da7734215b91901bed6")
      override fun queryCompute(queryCompute: QueryComputePaymentConfigProperty.Builder.() -> Unit):
          Unit = queryCompute(QueryComputePaymentConfigProperty(queryCompute))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty,
    ) : CdkObject(cdkObject), PaymentConfigurationProperty {
      override fun queryCompute(): Any = unwrap(this).getQueryCompute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PaymentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty):
          PaymentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PaymentConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty
    }
  }

  public interface MemberSpecificationProperty {
    public fun accountId(): String

    public fun displayName(): String

    public fun memberAbilities(): List<String>

    public fun paymentConfiguration(): Any? = unwrap(this).getPaymentConfiguration()

    @CdkDslMarker
    public interface Builder {
      public fun accountId(accountId: String)

      public fun displayName(displayName: String)

      public fun memberAbilities(memberAbilities: List<String>)

      public fun memberAbilities(vararg memberAbilities: String)

      public fun paymentConfiguration(paymentConfiguration: IResolvable)

      public fun paymentConfiguration(paymentConfiguration: PaymentConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d5a06511b955a4195335af93a8d0e1f041a053f94cec081565a6d60775ea448")
      public
          fun paymentConfiguration(paymentConfiguration: PaymentConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty.builder()

      override fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
      }

      override fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
      }

      override fun memberAbilities(memberAbilities: List<String>) {
        cdkBuilder.memberAbilities(memberAbilities)
      }

      override fun memberAbilities(vararg memberAbilities: String): Unit =
          memberAbilities(memberAbilities.toList())

      override fun paymentConfiguration(paymentConfiguration: IResolvable) {
        cdkBuilder.paymentConfiguration(paymentConfiguration.let(IResolvable::unwrap))
      }

      override fun paymentConfiguration(paymentConfiguration: PaymentConfigurationProperty) {
        cdkBuilder.paymentConfiguration(paymentConfiguration.let(PaymentConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d5a06511b955a4195335af93a8d0e1f041a053f94cec081565a6d60775ea448")
      override
          fun paymentConfiguration(paymentConfiguration: PaymentConfigurationProperty.Builder.() -> Unit):
          Unit = paymentConfiguration(PaymentConfigurationProperty(paymentConfiguration))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty,
    ) : CdkObject(cdkObject), MemberSpecificationProperty {
      override fun accountId(): String = unwrap(this).getAccountId()

      override fun displayName(): String = unwrap(this).getDisplayName()

      override fun memberAbilities(): List<String> = unwrap(this).getMemberAbilities()

      override fun paymentConfiguration(): Any? = unwrap(this).getPaymentConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemberSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty):
          MemberSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemberSpecificationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty
    }
  }

  public interface QueryComputePaymentConfigProperty {
    public fun isResponsible(): Any

    @CdkDslMarker
    public interface Builder {
      public fun isResponsible(isResponsible: Boolean)

      public fun isResponsible(isResponsible: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty.builder()

      override fun isResponsible(isResponsible: Boolean) {
        cdkBuilder.isResponsible(isResponsible)
      }

      override fun isResponsible(isResponsible: IResolvable) {
        cdkBuilder.isResponsible(isResponsible.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty,
    ) : CdkObject(cdkObject), QueryComputePaymentConfigProperty {
      override fun isResponsible(): Any = unwrap(this).getIsResponsible()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          QueryComputePaymentConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty):
          QueryComputePaymentConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryComputePaymentConfigProperty):
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty
    }
  }

  public interface DataEncryptionMetadataProperty {
    public fun allowCleartext(): Any

    public fun allowDuplicates(): Any

    public fun allowJoinsOnColumnsWithDifferentNames(): Any

    public fun preserveNulls(): Any

    @CdkDslMarker
    public interface Builder {
      public fun allowCleartext(allowCleartext: Boolean)

      public fun allowCleartext(allowCleartext: IResolvable)

      public fun allowDuplicates(allowDuplicates: Boolean)

      public fun allowDuplicates(allowDuplicates: IResolvable)

      public
          fun allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames: Boolean)

      public
          fun allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames: IResolvable)

      public fun preserveNulls(preserveNulls: Boolean)

      public fun preserveNulls(preserveNulls: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty.builder()

      override fun allowCleartext(allowCleartext: Boolean) {
        cdkBuilder.allowCleartext(allowCleartext)
      }

      override fun allowCleartext(allowCleartext: IResolvable) {
        cdkBuilder.allowCleartext(allowCleartext.let(IResolvable::unwrap))
      }

      override fun allowDuplicates(allowDuplicates: Boolean) {
        cdkBuilder.allowDuplicates(allowDuplicates)
      }

      override fun allowDuplicates(allowDuplicates: IResolvable) {
        cdkBuilder.allowDuplicates(allowDuplicates.let(IResolvable::unwrap))
      }

      override
          fun allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames: Boolean) {
        cdkBuilder.allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames)
      }

      override
          fun allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames: IResolvable) {
        cdkBuilder.allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames.let(IResolvable::unwrap))
      }

      override fun preserveNulls(preserveNulls: Boolean) {
        cdkBuilder.preserveNulls(preserveNulls)
      }

      override fun preserveNulls(preserveNulls: IResolvable) {
        cdkBuilder.preserveNulls(preserveNulls.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty,
    ) : CdkObject(cdkObject), DataEncryptionMetadataProperty {
      override fun allowCleartext(): Any = unwrap(this).getAllowCleartext()

      override fun allowDuplicates(): Any = unwrap(this).getAllowDuplicates()

      override fun allowJoinsOnColumnsWithDifferentNames(): Any =
          unwrap(this).getAllowJoinsOnColumnsWithDifferentNames()

      override fun preserveNulls(): Any = unwrap(this).getPreserveNulls()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataEncryptionMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty):
          DataEncryptionMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataEncryptionMetadataProperty):
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty
    }
  }
}
