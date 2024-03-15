@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAppBlockProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun name(): String

  public fun packagingType(): String? = unwrap(this).getPackagingType()

  public fun postSetupScriptDetails(): Any? = unwrap(this).getPostSetupScriptDetails()

  public fun setupScriptDetails(): Any? = unwrap(this).getSetupScriptDetails()

  public fun sourceS3Location(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun name(name: String)

    public fun packagingType(packagingType: String)

    public fun postSetupScriptDetails(postSetupScriptDetails: IResolvable)

    public fun postSetupScriptDetails(postSetupScriptDetails: CfnAppBlock.ScriptDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69d65117d6eff68fb390e4b810e147f744e2b78eedf6534b0b7b8687e601d211")
    public
        fun postSetupScriptDetails(postSetupScriptDetails: CfnAppBlock.ScriptDetailsProperty.Builder.() -> Unit)

    public fun sourceS3Location(sourceS3Location: IResolvable)

    public fun sourceS3Location(sourceS3Location: CfnAppBlock.S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2d6c12b3e575d63c0d58f3aac3356a076b5aa6d1e1e006641f4c7d3a5c03d20")
    public fun sourceS3Location(sourceS3Location: CfnAppBlock.S3LocationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun upScriptDetails(setupScriptDetails: IResolvable)

    public fun upScriptDetails(setupScriptDetails: CfnAppBlock.ScriptDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db995324b8b4ec7653a6e67f0ed64e37b1788dbbcab9e54b1cfbec7c348a543d")
    public
        fun upScriptDetails(setupScriptDetails: CfnAppBlock.ScriptDetailsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnAppBlockProps.Builder =
        software.amazon.awscdk.services.appstream.CfnAppBlockProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun packagingType(packagingType: String) {
      cdkBuilder.packagingType(packagingType)
    }

    override fun postSetupScriptDetails(postSetupScriptDetails: IResolvable) {
      cdkBuilder.postSetupScriptDetails(postSetupScriptDetails.let(IResolvable::unwrap))
    }

    override fun postSetupScriptDetails(postSetupScriptDetails: CfnAppBlock.ScriptDetailsProperty) {
      cdkBuilder.postSetupScriptDetails(postSetupScriptDetails.let(CfnAppBlock.ScriptDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69d65117d6eff68fb390e4b810e147f744e2b78eedf6534b0b7b8687e601d211")
    override
        fun postSetupScriptDetails(postSetupScriptDetails: CfnAppBlock.ScriptDetailsProperty.Builder.() -> Unit):
        Unit = postSetupScriptDetails(CfnAppBlock.ScriptDetailsProperty(postSetupScriptDetails))

    override fun sourceS3Location(sourceS3Location: IResolvable) {
      cdkBuilder.sourceS3Location(sourceS3Location.let(IResolvable::unwrap))
    }

    override fun sourceS3Location(sourceS3Location: CfnAppBlock.S3LocationProperty) {
      cdkBuilder.sourceS3Location(sourceS3Location.let(CfnAppBlock.S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2d6c12b3e575d63c0d58f3aac3356a076b5aa6d1e1e006641f4c7d3a5c03d20")
    override
        fun sourceS3Location(sourceS3Location: CfnAppBlock.S3LocationProperty.Builder.() -> Unit):
        Unit = sourceS3Location(CfnAppBlock.S3LocationProperty(sourceS3Location))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun upScriptDetails(setupScriptDetails: IResolvable) {
      cdkBuilder.setupScriptDetails(setupScriptDetails.let(IResolvable::unwrap))
    }

    override fun upScriptDetails(setupScriptDetails: CfnAppBlock.ScriptDetailsProperty) {
      cdkBuilder.setupScriptDetails(setupScriptDetails.let(CfnAppBlock.ScriptDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db995324b8b4ec7653a6e67f0ed64e37b1788dbbcab9e54b1cfbec7c348a543d")
    override
        fun upScriptDetails(setupScriptDetails: CfnAppBlock.ScriptDetailsProperty.Builder.() -> Unit):
        Unit = upScriptDetails(CfnAppBlock.ScriptDetailsProperty(setupScriptDetails))

    public fun build(): software.amazon.awscdk.services.appstream.CfnAppBlockProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockProps,
  ) : CdkObject(cdkObject), CfnAppBlockProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun name(): String = unwrap(this).getName()

    override fun packagingType(): String? = unwrap(this).getPackagingType()

    override fun postSetupScriptDetails(): Any? = unwrap(this).getPostSetupScriptDetails()

    override fun setupScriptDetails(): Any? = unwrap(this).getSetupScriptDetails()

    override fun sourceS3Location(): Any = unwrap(this).getSourceS3Location()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAppBlockProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockProps):
        CfnAppBlockProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAppBlockProps):
        software.amazon.awscdk.services.appstream.CfnAppBlockProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appstream.CfnAppBlockProps
  }
}
