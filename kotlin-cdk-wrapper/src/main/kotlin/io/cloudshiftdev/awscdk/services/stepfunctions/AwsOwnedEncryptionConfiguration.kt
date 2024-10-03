@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

/**
 * Define a new AwsOwnedEncryptionConfiguration.
 *
 * Example:
 *
 * ```
 * StateMachine stateMachine = StateMachine.Builder.create(this, "StateMachine")
 * .stateMachineName("StateMachine")
 * .definitionBody(DefinitionBody.fromChainable(Chain.start(new Pass(this, "Pass"))))
 * .stateMachineType(StateMachineType.STANDARD)
 * .encryptionConfiguration(new AwsOwnedEncryptionConfiguration())
 * .build();
 * ```
 */
public open class AwsOwnedEncryptionConfiguration(
  cdkObject: software.amazon.awscdk.services.stepfunctions.AwsOwnedEncryptionConfiguration,
) : EncryptionConfiguration(cdkObject) {
  public constructor() :
      this(software.amazon.awscdk.services.stepfunctions.AwsOwnedEncryptionConfiguration()
  )

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.AwsOwnedEncryptionConfiguration):
        AwsOwnedEncryptionConfiguration = AwsOwnedEncryptionConfiguration(cdkObject)

    internal fun unwrap(wrapped: AwsOwnedEncryptionConfiguration):
        software.amazon.awscdk.services.stepfunctions.AwsOwnedEncryptionConfiguration =
        wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.AwsOwnedEncryptionConfiguration
  }
}
