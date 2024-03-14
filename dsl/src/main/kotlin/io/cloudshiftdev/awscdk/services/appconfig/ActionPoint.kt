package io.cloudshiftdev.awscdk.services.appconfig

public enum class ActionPoint(
  private val cdkObject: software.amazon.awscdk.services.appconfig.ActionPoint,
) {
  PRE_CREATE_HOSTED_CONFIGURATION_VERSION(software.amazon.awscdk.services.appconfig.ActionPoint.PRE_CREATE_HOSTED_CONFIGURATION_VERSION),
  PRE_START_DEPLOYMENT(software.amazon.awscdk.services.appconfig.ActionPoint.PRE_START_DEPLOYMENT),
  ON_DEPLOYMENT_START(software.amazon.awscdk.services.appconfig.ActionPoint.ON_DEPLOYMENT_START),
  ON_DEPLOYMENT_STEP(software.amazon.awscdk.services.appconfig.ActionPoint.ON_DEPLOYMENT_STEP),
  ON_DEPLOYMENT_BAKING(software.amazon.awscdk.services.appconfig.ActionPoint.ON_DEPLOYMENT_BAKING),
  ON_DEPLOYMENT_COMPLETE(software.amazon.awscdk.services.appconfig.ActionPoint.ON_DEPLOYMENT_COMPLETE),
  ON_DEPLOYMENT_ROLLED_BACK(software.amazon.awscdk.services.appconfig.ActionPoint.ON_DEPLOYMENT_ROLLED_BACK),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ActionPoint): ActionPoint
        = when (cdkObject) {
      software.amazon.awscdk.services.appconfig.ActionPoint.PRE_CREATE_HOSTED_CONFIGURATION_VERSION ->
          ActionPoint.PRE_CREATE_HOSTED_CONFIGURATION_VERSION
      software.amazon.awscdk.services.appconfig.ActionPoint.PRE_START_DEPLOYMENT ->
          ActionPoint.PRE_START_DEPLOYMENT
      software.amazon.awscdk.services.appconfig.ActionPoint.ON_DEPLOYMENT_START ->
          ActionPoint.ON_DEPLOYMENT_START
      software.amazon.awscdk.services.appconfig.ActionPoint.ON_DEPLOYMENT_STEP ->
          ActionPoint.ON_DEPLOYMENT_STEP
      software.amazon.awscdk.services.appconfig.ActionPoint.ON_DEPLOYMENT_BAKING ->
          ActionPoint.ON_DEPLOYMENT_BAKING
      software.amazon.awscdk.services.appconfig.ActionPoint.ON_DEPLOYMENT_COMPLETE ->
          ActionPoint.ON_DEPLOYMENT_COMPLETE
      software.amazon.awscdk.services.appconfig.ActionPoint.ON_DEPLOYMENT_ROLLED_BACK ->
          ActionPoint.ON_DEPLOYMENT_ROLLED_BACK
    }

    internal fun unwrap(wrapped: ActionPoint): software.amazon.awscdk.services.appconfig.ActionPoint
        = wrapped.cdkObject
  }
}
