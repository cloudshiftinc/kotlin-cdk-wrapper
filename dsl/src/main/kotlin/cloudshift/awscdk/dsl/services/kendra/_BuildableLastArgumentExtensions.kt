@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.kendra.CfnDataSource
import software.amazon.awscdk.services.kendra.CfnFaq
import software.amazon.awscdk.services.kendra.CfnIndex

public inline fun CfnDataSource.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDataSource.setCustomDocumentEnrichmentConfiguration(block: CfnDataSourceCustomDocumentEnrichmentConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataSourceCustomDocumentEnrichmentConfigurationPropertyDsl()
  builder.apply(block)
  return setCustomDocumentEnrichmentConfiguration(builder.build())
}

public inline
    fun CfnDataSource.setDataSourceConfiguration(block: CfnDataSourceDataSourceConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataSourceDataSourceConfigurationPropertyDsl()
  builder.apply(block)
  return setDataSourceConfiguration(builder.build())
}

public inline fun CfnFaq.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnFaq.setS3Path(block: CfnFaqS3PathPropertyDsl.() -> Unit = {}) {
  val builder = CfnFaqS3PathPropertyDsl()
  builder.apply(block)
  return setS3Path(builder.build())
}

public inline fun CfnIndex.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnIndex.setCapacityUnits(block: CfnIndexCapacityUnitsConfigurationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnIndexCapacityUnitsConfigurationPropertyDsl()
  builder.apply(block)
  return setCapacityUnits(builder.build())
}

public inline
    fun CfnIndex.setServerSideEncryptionConfiguration(block: CfnIndexServerSideEncryptionConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnIndexServerSideEncryptionConfigurationPropertyDsl()
  builder.apply(block)
  return setServerSideEncryptionConfiguration(builder.build())
}
