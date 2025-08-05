@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * A list that allows you to specify, or override, the source revision for a pipeline execution
 * that's being started.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
 * SourceRevision sourceRevision = SourceRevision.builder()
 * .actionName("actionName")
 * .revisionType(RevisionType.COMMIT_ID)
 * .revisionValue("revisionValue")
 * .build();
 * ```
 */
public interface SourceRevision {
  /**
   * The name of the action where the override will be applied.
   */
  public fun actionName(): String

  /**
   * The type of source revision, based on the source provider.
   */
  public fun revisionType(): RevisionType

  /**
   * The source revision, or version of your source artifact, with the changes that you want to run
   * in the pipeline execution.
   */
  public fun revisionValue(): String

  /**
   * A builder for [SourceRevision]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The name of the action where the override will be applied. 
     */
    public fun actionName(actionName: String)

    /**
     * @param revisionType The type of source revision, based on the source provider. 
     */
    public fun revisionType(revisionType: RevisionType)

    /**
     * @param revisionValue The source revision, or version of your source artifact, with the
     * changes that you want to run in the pipeline execution. 
     */
    public fun revisionValue(revisionValue: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.SourceRevision.Builder =
        software.amazon.awscdk.services.codepipeline.actions.SourceRevision.builder()

    /**
     * @param actionName The name of the action where the override will be applied. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param revisionType The type of source revision, based on the source provider. 
     */
    override fun revisionType(revisionType: RevisionType) {
      cdkBuilder.revisionType(revisionType.let(RevisionType.Companion::unwrap))
    }

    /**
     * @param revisionValue The source revision, or version of your source artifact, with the
     * changes that you want to run in the pipeline execution. 
     */
    override fun revisionValue(revisionValue: String) {
      cdkBuilder.revisionValue(revisionValue)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.SourceRevision =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.SourceRevision,
  ) : CdkObject(cdkObject),
      SourceRevision {
    /**
     * The name of the action where the override will be applied.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * The type of source revision, based on the source provider.
     */
    override fun revisionType(): RevisionType =
        unwrap(this).getRevisionType().let(RevisionType::wrap)

    /**
     * The source revision, or version of your source artifact, with the changes that you want to
     * run in the pipeline execution.
     */
    override fun revisionValue(): String = unwrap(this).getRevisionValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SourceRevision {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.SourceRevision):
        SourceRevision = CdkObjectWrappers.wrap(cdkObject) as? SourceRevision ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceRevision):
        software.amazon.awscdk.services.codepipeline.actions.SourceRevision = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.actions.SourceRevision
  }
}
