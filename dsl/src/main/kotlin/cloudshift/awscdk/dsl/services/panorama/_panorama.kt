@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.panorama

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.panorama.CfnApplicationInstance
import software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps
import software.amazon.awscdk.services.panorama.CfnPackage
import software.amazon.awscdk.services.panorama.CfnPackageProps
import software.amazon.awscdk.services.panorama.CfnPackageVersion
import software.amazon.awscdk.services.panorama.CfnPackageVersionProps
import software.constructs.Construct

public object panorama {
  public inline fun cfnApplicationInstance(
    scope: Construct,
    id: String,
    block: CfnApplicationInstanceDsl.() -> Unit = {},
  ): CfnApplicationInstance {
    val builder = CfnApplicationInstanceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationInstanceManifestOverridesPayloadProperty(block: CfnApplicationInstanceManifestOverridesPayloadPropertyDsl.() -> Unit
      = {}): CfnApplicationInstance.ManifestOverridesPayloadProperty {
    val builder = CfnApplicationInstanceManifestOverridesPayloadPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationInstanceManifestPayloadProperty(block: CfnApplicationInstanceManifestPayloadPropertyDsl.() -> Unit
      = {}): CfnApplicationInstance.ManifestPayloadProperty {
    val builder = CfnApplicationInstanceManifestPayloadPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationInstanceProps(block: CfnApplicationInstancePropsDsl.() -> Unit =
      {}): CfnApplicationInstanceProps {
    val builder = CfnApplicationInstancePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPackage(
    scope: Construct,
    id: String,
    block: CfnPackageDsl.() -> Unit = {},
  ): CfnPackage {
    val builder = CfnPackageDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPackageProps(block: CfnPackagePropsDsl.() -> Unit = {}): CfnPackageProps {
    val builder = CfnPackagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPackageStorageLocationProperty(block: CfnPackageStorageLocationPropertyDsl.() -> Unit =
      {}): CfnPackage.StorageLocationProperty {
    val builder = CfnPackageStorageLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPackageVersion(
    scope: Construct,
    id: String,
    block: CfnPackageVersionDsl.() -> Unit = {},
  ): CfnPackageVersion {
    val builder = CfnPackageVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPackageVersionProps(block: CfnPackageVersionPropsDsl.() -> Unit = {}):
      CfnPackageVersionProps {
    val builder = CfnPackageVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
