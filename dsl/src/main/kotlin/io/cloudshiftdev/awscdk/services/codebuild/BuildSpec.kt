package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

public abstract class BuildSpec internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codebuild.BuildSpec,
) {
  public open fun isImmediate(): Boolean = unwrap(this).getIsImmediate()

  public open fun toBuildSpec(): String = unwrap(this).toBuildSpec()

  public open fun toBuildSpec(arg0: Construct): String =
      unwrap(this).toBuildSpec(arg0.let(Construct::unwrap))

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.BuildSpec,
  ) : BuildSpec(cdkObject)

  public companion object {
    public open fun fromAsset(path: String): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromAsset(path).let(BuildSpec::wrap)

    public open fun fromObject(`value`: Map<String, Any>): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromObject(`value`).let(BuildSpec::wrap)

    public open fun fromObjectToYaml(`value`: Map<String, Any>): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromObjectToYaml(`value`).let(BuildSpec::wrap)

    public open fun fromSourceFilename(filename: String): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromSourceFilename(filename).let(BuildSpec::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BuildSpec): BuildSpec =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BuildSpec): software.amazon.awscdk.services.codebuild.BuildSpec =
        (wrapped as Wrapper).cdkObject
  }
}
