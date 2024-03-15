@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codecommit.IRepository
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CodeCommitSourceProps : SourceProps {
  public fun branchOrRef(): String? = unwrap(this).getBranchOrRef()

  public fun cloneDepth(): Number? = unwrap(this).getCloneDepth()

  public fun fetchSubmodules(): Boolean? = unwrap(this).getFetchSubmodules()

  public fun repository(): IRepository

  @CdkDslMarker
  public interface Builder {
    public fun branchOrRef(branchOrRef: String)

    public fun cloneDepth(cloneDepth: Number)

    public fun fetchSubmodules(fetchSubmodules: Boolean)

    public fun identifier(identifier: String)

    public fun repository(repository: IRepository)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CodeCommitSourceProps.Builder
        = software.amazon.awscdk.services.codebuild.CodeCommitSourceProps.builder()

    override fun branchOrRef(branchOrRef: String) {
      cdkBuilder.branchOrRef(branchOrRef)
    }

    override fun cloneDepth(cloneDepth: Number) {
      cdkBuilder.cloneDepth(cloneDepth)
    }

    override fun fetchSubmodules(fetchSubmodules: Boolean) {
      cdkBuilder.fetchSubmodules(fetchSubmodules)
    }

    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    override fun repository(repository: IRepository) {
      cdkBuilder.repository(repository.let(IRepository::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.CodeCommitSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.CodeCommitSourceProps,
  ) : CdkObject(cdkObject), CodeCommitSourceProps {
    override fun branchOrRef(): String? = unwrap(this).getBranchOrRef()

    override fun cloneDepth(): Number? = unwrap(this).getCloneDepth()

    override fun fetchSubmodules(): Boolean? = unwrap(this).getFetchSubmodules()

    override fun identifier(): String? = unwrap(this).getIdentifier()

    override fun repository(): IRepository = unwrap(this).getRepository().let(IRepository::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeCommitSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CodeCommitSourceProps):
        CodeCommitSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeCommitSourceProps):
        software.amazon.awscdk.services.codebuild.CodeCommitSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.CodeCommitSourceProps
  }
}
