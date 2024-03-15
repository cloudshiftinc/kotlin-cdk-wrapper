@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnRepositoryProps {
  public fun code(): Any? = unwrap(this).getCode()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun repositoryDescription(): String? = unwrap(this).getRepositoryDescription()

  public fun repositoryName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun triggers(): Any? = unwrap(this).getTriggers()

  @CdkDslMarker
  public interface Builder {
    public fun code(code: IResolvable)

    public fun code(code: CfnRepository.CodeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3362cd5fbc6378c72f0770c9179381e51ab802c441811b23c2b68da11403ad39")
    public fun code(code: CfnRepository.CodeProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun repositoryDescription(repositoryDescription: String)

    public fun repositoryName(repositoryName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun triggers(triggers: IResolvable)

    public fun triggers(triggers: List<Any>)

    public fun triggers(vararg triggers: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codecommit.CfnRepositoryProps.Builder =
        software.amazon.awscdk.services.codecommit.CfnRepositoryProps.builder()

    override fun code(code: IResolvable) {
      cdkBuilder.code(code.let(IResolvable::unwrap))
    }

    override fun code(code: CfnRepository.CodeProperty) {
      cdkBuilder.code(code.let(CfnRepository.CodeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3362cd5fbc6378c72f0770c9179381e51ab802c441811b23c2b68da11403ad39")
    override fun code(code: CfnRepository.CodeProperty.Builder.() -> Unit): Unit =
        code(CfnRepository.CodeProperty(code))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun repositoryDescription(repositoryDescription: String) {
      cdkBuilder.repositoryDescription(repositoryDescription)
    }

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun triggers(triggers: IResolvable) {
      cdkBuilder.triggers(triggers.let(IResolvable::unwrap))
    }

    override fun triggers(triggers: List<Any>) {
      cdkBuilder.triggers(triggers)
    }

    override fun triggers(vararg triggers: Any): Unit = triggers(triggers.toList())

    public fun build(): software.amazon.awscdk.services.codecommit.CfnRepositoryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codecommit.CfnRepositoryProps,
  ) : CdkObject(cdkObject), CfnRepositoryProps {
    override fun code(): Any? = unwrap(this).getCode()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun repositoryDescription(): String? = unwrap(this).getRepositoryDescription()

    override fun repositoryName(): String = unwrap(this).getRepositoryName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun triggers(): Any? = unwrap(this).getTriggers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRepositoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.CfnRepositoryProps):
        CfnRepositoryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryProps):
        software.amazon.awscdk.services.codecommit.CfnRepositoryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codecommit.CfnRepositoryProps
  }
}
