@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface RepositoryProps {
  public fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

  public fun description(): String? = unwrap(this).getDescription()

  public fun repositoryName(): String

  @CdkDslMarker
  public interface Builder {
    public fun code(code: Code)

    public fun description(description: String)

    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codecommit.RepositoryProps.Builder =
        software.amazon.awscdk.services.codecommit.RepositoryProps.builder()

    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): software.amazon.awscdk.services.codecommit.RepositoryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codecommit.RepositoryProps,
  ) : CdkObject(cdkObject), RepositoryProps {
    override fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun repositoryName(): String = unwrap(this).getRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.RepositoryProps):
        RepositoryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RepositoryProps):
        software.amazon.awscdk.services.codecommit.RepositoryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codecommit.RepositoryProps
  }
}
