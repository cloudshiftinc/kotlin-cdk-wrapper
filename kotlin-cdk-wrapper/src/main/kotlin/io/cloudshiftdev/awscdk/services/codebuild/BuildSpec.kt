@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

public abstract class BuildSpec internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.BuildSpec,
) : CdkObject(cdkObject) {
  public open fun isImmediate(): Boolean = unwrap(this).getIsImmediate()

  public open fun toBuildSpec(): String = unwrap(this).toBuildSpec()

  public open fun toBuildSpec(arg0: Construct): String =
      unwrap(this).toBuildSpec(arg0.let(Construct::unwrap))

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.BuildSpec,
  ) : BuildSpec(cdkObject)

  public companion object {
    public fun fromAsset(path: String): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromAsset(path).let(BuildSpec::wrap)

    public fun fromObject(`value`: Map<String, Any>): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromObject(`value`).let(BuildSpec::wrap)

    public fun fromObjectToYaml(`value`: Map<String, Any>): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromObjectToYaml(`value`).let(BuildSpec::wrap)

    public fun fromSourceFilename(filename: String): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromSourceFilename(filename).let(BuildSpec::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BuildSpec): BuildSpec =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BuildSpec): software.amazon.awscdk.services.codebuild.BuildSpec =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.BuildSpec
  }
}
