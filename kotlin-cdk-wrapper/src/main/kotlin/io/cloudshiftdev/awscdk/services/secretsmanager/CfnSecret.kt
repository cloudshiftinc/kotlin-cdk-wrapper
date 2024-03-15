@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecret internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecret,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun generateSecretString(): Any? = unwrap(this).getGenerateSecretString()

  public open fun generateSecretString(`value`: IResolvable) {
    unwrap(this).setGenerateSecretString(`value`.let(IResolvable::unwrap))
  }

  public open fun generateSecretString(`value`: GenerateSecretStringProperty) {
    unwrap(this).setGenerateSecretString(`value`.let(GenerateSecretStringProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ce0c9ae0a4a2c3e0961e4898afd7dcf90c753741118fc61870dd5064e7fe9f78")
  public open fun generateSecretString(`value`: GenerateSecretStringProperty.Builder.() -> Unit):
      Unit = generateSecretString(GenerateSecretStringProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun replicaRegions(): Any? = unwrap(this).getReplicaRegions()

  public open fun replicaRegions(`value`: IResolvable) {
    unwrap(this).setReplicaRegions(`value`.let(IResolvable::unwrap))
  }

  public open fun replicaRegions(__idx_ac66f0: List<Any>) {
    unwrap(this).setReplicaRegions(__idx_ac66f0)
  }

  public open fun replicaRegions(vararg __idx_ac66f0: Any): Unit =
      replicaRegions(__idx_ac66f0.toList())

  public open fun secretString(): String? = unwrap(this).getSecretString()

  public open fun secretString(`value`: String) {
    unwrap(this).setSecretString(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun generateSecretString(generateSecretString: IResolvable)

    public fun generateSecretString(generateSecretString: GenerateSecretStringProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e223691f205e021a942110c10c4226c829ebe5305e708ddfa406aedf731c0b9")
    public
        fun generateSecretString(generateSecretString: GenerateSecretStringProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun name(name: String)

    public fun replicaRegions(replicaRegions: IResolvable)

    public fun replicaRegions(replicaRegions: List<Any>)

    public fun replicaRegions(vararg replicaRegions: Any)

    public fun secretString(secretString: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.CfnSecret.Builder =
        software.amazon.awscdk.services.secretsmanager.CfnSecret.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun generateSecretString(generateSecretString: IResolvable) {
      cdkBuilder.generateSecretString(generateSecretString.let(IResolvable::unwrap))
    }

    override fun generateSecretString(generateSecretString: GenerateSecretStringProperty) {
      cdkBuilder.generateSecretString(generateSecretString.let(GenerateSecretStringProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e223691f205e021a942110c10c4226c829ebe5305e708ddfa406aedf731c0b9")
    override
        fun generateSecretString(generateSecretString: GenerateSecretStringProperty.Builder.() -> Unit):
        Unit = generateSecretString(GenerateSecretStringProperty(generateSecretString))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun replicaRegions(replicaRegions: IResolvable) {
      cdkBuilder.replicaRegions(replicaRegions.let(IResolvable::unwrap))
    }

    override fun replicaRegions(replicaRegions: List<Any>) {
      cdkBuilder.replicaRegions(replicaRegions)
    }

    override fun replicaRegions(vararg replicaRegions: Any): Unit =
        replicaRegions(replicaRegions.toList())

    override fun secretString(secretString: String) {
      cdkBuilder.secretString(secretString)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.secretsmanager.CfnSecret =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.secretsmanager.CfnSecret.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecret {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecret(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecret):
        CfnSecret = CfnSecret(cdkObject)

    internal fun unwrap(wrapped: CfnSecret):
        software.amazon.awscdk.services.secretsmanager.CfnSecret = wrapped.cdkObject
  }

  public interface ReplicaRegionProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun region(): String

    @CdkDslMarker
    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)

      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty.Builder =
          software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty,
    ) : CdkObject(cdkObject), ReplicaRegionProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun region(): String = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicaRegionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty):
          ReplicaRegionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicaRegionProperty):
          software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.secretsmanager.CfnSecret.ReplicaRegionProperty
    }
  }

  public interface GenerateSecretStringProperty {
    public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    public fun excludeLowercase(): Any? = unwrap(this).getExcludeLowercase()

    public fun excludeNumbers(): Any? = unwrap(this).getExcludeNumbers()

    public fun excludePunctuation(): Any? = unwrap(this).getExcludePunctuation()

    public fun excludeUppercase(): Any? = unwrap(this).getExcludeUppercase()

    public fun generateStringKey(): String? = unwrap(this).getGenerateStringKey()

    public fun includeSpace(): Any? = unwrap(this).getIncludeSpace()

    public fun passwordLength(): Number? = unwrap(this).getPasswordLength()

    public fun requireEachIncludedType(): Any? = unwrap(this).getRequireEachIncludedType()

    public fun secretStringTemplate(): String? = unwrap(this).getSecretStringTemplate()

    @CdkDslMarker
    public interface Builder {
      public fun excludeCharacters(excludeCharacters: String)

      public fun excludeLowercase(excludeLowercase: Boolean)

      public fun excludeLowercase(excludeLowercase: IResolvable)

      public fun excludeNumbers(excludeNumbers: Boolean)

      public fun excludeNumbers(excludeNumbers: IResolvable)

      public fun excludePunctuation(excludePunctuation: Boolean)

      public fun excludePunctuation(excludePunctuation: IResolvable)

      public fun excludeUppercase(excludeUppercase: Boolean)

      public fun excludeUppercase(excludeUppercase: IResolvable)

      public fun generateStringKey(generateStringKey: String)

      public fun includeSpace(includeSpace: Boolean)

      public fun includeSpace(includeSpace: IResolvable)

      public fun passwordLength(passwordLength: Number)

      public fun requireEachIncludedType(requireEachIncludedType: Boolean)

      public fun requireEachIncludedType(requireEachIncludedType: IResolvable)

      public fun secretStringTemplate(secretStringTemplate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder
          =
          software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.builder()

      override fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
      }

      override fun excludeLowercase(excludeLowercase: Boolean) {
        cdkBuilder.excludeLowercase(excludeLowercase)
      }

      override fun excludeLowercase(excludeLowercase: IResolvable) {
        cdkBuilder.excludeLowercase(excludeLowercase.let(IResolvable::unwrap))
      }

      override fun excludeNumbers(excludeNumbers: Boolean) {
        cdkBuilder.excludeNumbers(excludeNumbers)
      }

      override fun excludeNumbers(excludeNumbers: IResolvable) {
        cdkBuilder.excludeNumbers(excludeNumbers.let(IResolvable::unwrap))
      }

      override fun excludePunctuation(excludePunctuation: Boolean) {
        cdkBuilder.excludePunctuation(excludePunctuation)
      }

      override fun excludePunctuation(excludePunctuation: IResolvable) {
        cdkBuilder.excludePunctuation(excludePunctuation.let(IResolvable::unwrap))
      }

      override fun excludeUppercase(excludeUppercase: Boolean) {
        cdkBuilder.excludeUppercase(excludeUppercase)
      }

      override fun excludeUppercase(excludeUppercase: IResolvable) {
        cdkBuilder.excludeUppercase(excludeUppercase.let(IResolvable::unwrap))
      }

      override fun generateStringKey(generateStringKey: String) {
        cdkBuilder.generateStringKey(generateStringKey)
      }

      override fun includeSpace(includeSpace: Boolean) {
        cdkBuilder.includeSpace(includeSpace)
      }

      override fun includeSpace(includeSpace: IResolvable) {
        cdkBuilder.includeSpace(includeSpace.let(IResolvable::unwrap))
      }

      override fun passwordLength(passwordLength: Number) {
        cdkBuilder.passwordLength(passwordLength)
      }

      override fun requireEachIncludedType(requireEachIncludedType: Boolean) {
        cdkBuilder.requireEachIncludedType(requireEachIncludedType)
      }

      override fun requireEachIncludedType(requireEachIncludedType: IResolvable) {
        cdkBuilder.requireEachIncludedType(requireEachIncludedType.let(IResolvable::unwrap))
      }

      override fun secretStringTemplate(secretStringTemplate: String) {
        cdkBuilder.secretStringTemplate(secretStringTemplate)
      }

      public fun build():
          software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty,
    ) : CdkObject(cdkObject), GenerateSecretStringProperty {
      override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

      override fun excludeLowercase(): Any? = unwrap(this).getExcludeLowercase()

      override fun excludeNumbers(): Any? = unwrap(this).getExcludeNumbers()

      override fun excludePunctuation(): Any? = unwrap(this).getExcludePunctuation()

      override fun excludeUppercase(): Any? = unwrap(this).getExcludeUppercase()

      override fun generateStringKey(): String? = unwrap(this).getGenerateStringKey()

      override fun includeSpace(): Any? = unwrap(this).getIncludeSpace()

      override fun passwordLength(): Number? = unwrap(this).getPasswordLength()

      override fun requireEachIncludedType(): Any? = unwrap(this).getRequireEachIncludedType()

      override fun secretStringTemplate(): String? = unwrap(this).getSecretStringTemplate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GenerateSecretStringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty):
          GenerateSecretStringProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GenerateSecretStringProperty):
          software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty
    }
  }
}
