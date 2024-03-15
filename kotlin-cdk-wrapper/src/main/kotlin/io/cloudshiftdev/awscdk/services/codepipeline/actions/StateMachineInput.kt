@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import kotlin.Any
import kotlin.String

public open class StateMachineInput internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.StateMachineInput,
) : CdkObject(cdkObject) {
  public open fun input(): Any = unwrap(this).getInput()

  public open fun inputArtifact(): Artifact? = unwrap(this).getInputArtifact()?.let(Artifact::wrap)

  public open fun inputType(): String? = unwrap(this).getInputType()

  public companion object {
    public fun filePath(inputFile: ArtifactPath): StateMachineInput =
        software.amazon.awscdk.services.codepipeline.actions.StateMachineInput.filePath(inputFile.let(ArtifactPath::unwrap)).let(StateMachineInput::wrap)

    public fun literal(`object`: ObjectNode): StateMachineInput =
        software.amazon.awscdk.services.codepipeline.actions.StateMachineInput.literal(`object`).let(StateMachineInput::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.StateMachineInput):
        StateMachineInput = StateMachineInput(cdkObject)

    internal fun unwrap(wrapped: StateMachineInput):
        software.amazon.awscdk.services.codepipeline.actions.StateMachineInput = wrapped.cdkObject
  }
}
