package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCollaboration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration,
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
      ?: emptyList()

  public open fun creatorMemberAbilities(`value`: List<String>) {
    unwrap(this).setCreatorMemberAbilities(`value`)
  }

  public open fun creatorPaymentConfiguration(): Any? =
      unwrap(this).getCreatorPaymentConfiguration()

  public open fun creatorPaymentConfiguration(`value`: IResolvable) {
    unwrap(this).setCreatorPaymentConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun creatorPaymentConfiguration(`value`: PaymentConfigurationProperty) {
    unwrap(this).setCreatorPaymentConfiguration(`value`.let(PaymentConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  public interface Builder {
    public fun creatorDisplayName(creatorDisplayName: String) {
    }

    public fun creatorMemberAbilities(creatorMemberAbilities: List<String>) {
    }

    public fun creatorPaymentConfiguration(creatorPaymentConfiguration: IResolvable) {
    }

    public
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: PaymentConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9881ba8f65accaca98fab8be01e5349ad5c421b1be9fd1c5b2df4e9aa4006398")
    public
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: PaymentConfigurationProperty.Builder.() -> Unit) {
    }

    public fun dataEncryptionMetadata(dataEncryptionMetadata: IResolvable) {
    }

    public fun dataEncryptionMetadata(dataEncryptionMetadata: DataEncryptionMetadataProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("656599c92756a39c63decd3f4368484a397187171f0b4b32ea3e38ea82b5f7dd")
    public
        fun dataEncryptionMetadata(dataEncryptionMetadata: DataEncryptionMetadataProperty.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun members(members: IResolvable) {
    }

    public fun members(members: List<Any>) {
    }

    public fun name(name: String) {
    }

    public fun queryLogStatus(queryLogStatus: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cleanrooms.CfnCollaboration.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnCollaboration.Builder.create(scope, id)

    public override fun creatorDisplayName(creatorDisplayName: String) {
      cdkBuilder.creatorDisplayName(creatorDisplayName)
    }

    public override fun creatorMemberAbilities(creatorMemberAbilities: List<String>) {
      cdkBuilder.creatorMemberAbilities(creatorMemberAbilities)
    }

    public override fun creatorPaymentConfiguration(creatorPaymentConfiguration: IResolvable) {
      cdkBuilder.creatorPaymentConfiguration(creatorPaymentConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: PaymentConfigurationProperty) {
      cdkBuilder.creatorPaymentConfiguration(creatorPaymentConfiguration.let(PaymentConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9881ba8f65accaca98fab8be01e5349ad5c421b1be9fd1c5b2df4e9aa4006398")
    public override
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: PaymentConfigurationProperty.Builder.() -> Unit):
        Unit =
        creatorPaymentConfiguration(PaymentConfigurationProperty(creatorPaymentConfiguration))

    public override fun dataEncryptionMetadata(dataEncryptionMetadata: IResolvable) {
      cdkBuilder.dataEncryptionMetadata(dataEncryptionMetadata.let(IResolvable::unwrap))
    }

    public override
        fun dataEncryptionMetadata(dataEncryptionMetadata: DataEncryptionMetadataProperty) {
      cdkBuilder.dataEncryptionMetadata(dataEncryptionMetadata.let(DataEncryptionMetadataProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("656599c92756a39c63decd3f4368484a397187171f0b4b32ea3e38ea82b5f7dd")
    public override
        fun dataEncryptionMetadata(dataEncryptionMetadata: DataEncryptionMetadataProperty.Builder.() -> Unit):
        Unit = dataEncryptionMetadata(DataEncryptionMetadataProperty(dataEncryptionMetadata))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun members(members: IResolvable) {
      cdkBuilder.members(members.let(IResolvable::unwrap))
    }

    public override fun members(members: List<Any>) {
      cdkBuilder.members(members)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun queryLogStatus(queryLogStatus: String) {
      cdkBuilder.queryLogStatus(queryLogStatus)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnCollaboration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun queryCompute(queryCompute: IResolvable) {
      }

      public fun queryCompute(queryCompute: QueryComputePaymentConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1619053f2bed07c05e5bf24c29eab5e69eae176b5c877da7734215b91901bed6")
      public fun queryCompute(queryCompute: QueryComputePaymentConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty.builder()

      public override fun queryCompute(queryCompute: IResolvable) {
        cdkBuilder.queryCompute(queryCompute.let(IResolvable::unwrap))
      }

      public override fun queryCompute(queryCompute: QueryComputePaymentConfigProperty) {
        cdkBuilder.queryCompute(queryCompute.let(QueryComputePaymentConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1619053f2bed07c05e5bf24c29eab5e69eae176b5c877da7734215b91901bed6")
      public override
          fun queryCompute(queryCompute: QueryComputePaymentConfigProperty.Builder.() -> Unit): Unit
          = queryCompute(QueryComputePaymentConfigProperty(queryCompute))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty,
    ) : PaymentConfigurationProperty {
      public override fun queryCompute(): Any = unwrap(this).getQueryCompute()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PaymentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty):
          PaymentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PaymentConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MemberSpecificationProperty {
    public fun accountId(): String

    public fun displayName(): String

    public fun memberAbilities(): List<String>

    public fun paymentConfiguration(): Any? = unwrap(this).getPaymentConfiguration()

    public interface Builder {
      public fun accountId(accountId: String) {
      }

      public fun displayName(displayName: String) {
      }

      public fun memberAbilities(memberAbilities: List<String>) {
      }

      public fun paymentConfiguration(paymentConfiguration: IResolvable) {
      }

      public fun paymentConfiguration(paymentConfiguration: PaymentConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d5a06511b955a4195335af93a8d0e1f041a053f94cec081565a6d60775ea448")
      public
          fun paymentConfiguration(paymentConfiguration: PaymentConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty.builder()

      public override fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
      }

      public override fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
      }

      public override fun memberAbilities(memberAbilities: List<String>) {
        cdkBuilder.memberAbilities(memberAbilities)
      }

      public override fun paymentConfiguration(paymentConfiguration: IResolvable) {
        cdkBuilder.paymentConfiguration(paymentConfiguration.let(IResolvable::unwrap))
      }

      public override fun paymentConfiguration(paymentConfiguration: PaymentConfigurationProperty) {
        cdkBuilder.paymentConfiguration(paymentConfiguration.let(PaymentConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d5a06511b955a4195335af93a8d0e1f041a053f94cec081565a6d60775ea448")
      public override
          fun paymentConfiguration(paymentConfiguration: PaymentConfigurationProperty.Builder.() -> Unit):
          Unit = paymentConfiguration(PaymentConfigurationProperty(paymentConfiguration))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty,
    ) : MemberSpecificationProperty {
      public override fun accountId(): String = unwrap(this).getAccountId()

      public override fun displayName(): String = unwrap(this).getDisplayName()

      public override fun memberAbilities(): List<String> = unwrap(this).getMemberAbilities() ?:
          emptyList()

      public override fun paymentConfiguration(): Any? = unwrap(this).getPaymentConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MemberSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty):
          MemberSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemberSpecificationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface QueryComputePaymentConfigProperty {
    public fun isResponsible(): Any

    public interface Builder {
      public fun isResponsible(isResponsible: Boolean) {
      }

      public fun isResponsible(isResponsible: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty.builder()

      public override fun isResponsible(isResponsible: Boolean) {
        cdkBuilder.isResponsible(isResponsible)
      }

      public override fun isResponsible(isResponsible: IResolvable) {
        cdkBuilder.isResponsible(isResponsible.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty,
    ) : QueryComputePaymentConfigProperty {
      public override fun isResponsible(): Any = unwrap(this).getIsResponsible()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataEncryptionMetadataProperty {
    public fun allowCleartext(): Any

    public fun allowDuplicates(): Any

    public fun allowJoinsOnColumnsWithDifferentNames(): Any

    public fun preserveNulls(): Any

    public interface Builder {
      public fun allowCleartext(allowCleartext: Boolean) {
      }

      public fun allowCleartext(allowCleartext: IResolvable) {
      }

      public fun allowDuplicates(allowDuplicates: Boolean) {
      }

      public fun allowDuplicates(allowDuplicates: IResolvable) {
      }

      public
          fun allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames: Boolean) {
      }

      public
          fun allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames: IResolvable) {
      }

      public fun preserveNulls(preserveNulls: Boolean) {
      }

      public fun preserveNulls(preserveNulls: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty.builder()

      public override fun allowCleartext(allowCleartext: Boolean) {
        cdkBuilder.allowCleartext(allowCleartext)
      }

      public override fun allowCleartext(allowCleartext: IResolvable) {
        cdkBuilder.allowCleartext(allowCleartext.let(IResolvable::unwrap))
      }

      public override fun allowDuplicates(allowDuplicates: Boolean) {
        cdkBuilder.allowDuplicates(allowDuplicates)
      }

      public override fun allowDuplicates(allowDuplicates: IResolvable) {
        cdkBuilder.allowDuplicates(allowDuplicates.let(IResolvable::unwrap))
      }

      public override
          fun allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames: Boolean) {
        cdkBuilder.allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames)
      }

      public override
          fun allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames: IResolvable) {
        cdkBuilder.allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames.let(IResolvable::unwrap))
      }

      public override fun preserveNulls(preserveNulls: Boolean) {
        cdkBuilder.preserveNulls(preserveNulls)
      }

      public override fun preserveNulls(preserveNulls: IResolvable) {
        cdkBuilder.preserveNulls(preserveNulls.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty,
    ) : DataEncryptionMetadataProperty {
      public override fun allowCleartext(): Any = unwrap(this).getAllowCleartext()

      public override fun allowDuplicates(): Any = unwrap(this).getAllowDuplicates()

      public override fun allowJoinsOnColumnsWithDifferentNames(): Any =
          unwrap(this).getAllowJoinsOnColumnsWithDifferentNames()

      public override fun preserveNulls(): Any = unwrap(this).getPreserveNulls()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataEncryptionMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty):
          DataEncryptionMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataEncryptionMetadataProperty):
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
