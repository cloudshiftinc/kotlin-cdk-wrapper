@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataQualityJobDefinition internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrJobDefinitionArn(): String = unwrap(this).getAttrJobDefinitionArn()

  public open fun dataQualityAppSpecification(): Any = unwrap(this).getDataQualityAppSpecification()

  public open fun dataQualityAppSpecification(`value`: IResolvable) {
    unwrap(this).setDataQualityAppSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun dataQualityAppSpecification(`value`: DataQualityAppSpecificationProperty) {
    unwrap(this).setDataQualityAppSpecification(`value`.let(DataQualityAppSpecificationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0d6faa814165aa026b6240bb1ce56f778452a0f834a2063d6b777e692aa3ff17")
  public open
      fun dataQualityAppSpecification(`value`: DataQualityAppSpecificationProperty.Builder.() -> Unit):
      Unit = dataQualityAppSpecification(DataQualityAppSpecificationProperty(`value`))

  public open fun dataQualityBaselineConfig(): Any? = unwrap(this).getDataQualityBaselineConfig()

  public open fun dataQualityBaselineConfig(`value`: IResolvable) {
    unwrap(this).setDataQualityBaselineConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun dataQualityBaselineConfig(`value`: DataQualityBaselineConfigProperty) {
    unwrap(this).setDataQualityBaselineConfig(`value`.let(DataQualityBaselineConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7b9ca5fec36608b0220626c08570819586485fb777d40d3df3e257cff51cde8f")
  public open
      fun dataQualityBaselineConfig(`value`: DataQualityBaselineConfigProperty.Builder.() -> Unit):
      Unit = dataQualityBaselineConfig(DataQualityBaselineConfigProperty(`value`))

  public open fun dataQualityJobInput(): Any = unwrap(this).getDataQualityJobInput()

  public open fun dataQualityJobInput(`value`: IResolvable) {
    unwrap(this).setDataQualityJobInput(`value`.let(IResolvable::unwrap))
  }

  public open fun dataQualityJobInput(`value`: DataQualityJobInputProperty) {
    unwrap(this).setDataQualityJobInput(`value`.let(DataQualityJobInputProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bbe1c04fd4ed08b6885a5459413a61581b2ff29a0764e9a3e9324d03ff6264aa")
  public open fun dataQualityJobInput(`value`: DataQualityJobInputProperty.Builder.() -> Unit): Unit
      = dataQualityJobInput(DataQualityJobInputProperty(`value`))

  public open fun dataQualityJobOutputConfig(): Any = unwrap(this).getDataQualityJobOutputConfig()

  public open fun dataQualityJobOutputConfig(`value`: IResolvable) {
    unwrap(this).setDataQualityJobOutputConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun dataQualityJobOutputConfig(`value`: MonitoringOutputConfigProperty) {
    unwrap(this).setDataQualityJobOutputConfig(`value`.let(MonitoringOutputConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3beab3de9b772d64b24254795f69ac6747af8571982ff57cc4c8163e17eae694")
  public open
      fun dataQualityJobOutputConfig(`value`: MonitoringOutputConfigProperty.Builder.() -> Unit):
      Unit = dataQualityJobOutputConfig(MonitoringOutputConfigProperty(`value`))

  public open fun endpointName(): String? = unwrap(this).getEndpointName()

  public open fun endpointName(`value`: String) {
    unwrap(this).setEndpointName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  public open fun jobDefinitionName(`value`: String) {
    unwrap(this).setJobDefinitionName(`value`)
  }

  public open fun jobResources(): Any = unwrap(this).getJobResources()

  public open fun jobResources(`value`: IResolvable) {
    unwrap(this).setJobResources(`value`.let(IResolvable::unwrap))
  }

  public open fun jobResources(`value`: MonitoringResourcesProperty) {
    unwrap(this).setJobResources(`value`.let(MonitoringResourcesProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7bb8a7279c2edbe6819683322d007f55053f98e4e916596fef113db65b1f8a56")
  public open fun jobResources(`value`: MonitoringResourcesProperty.Builder.() -> Unit): Unit =
      jobResources(MonitoringResourcesProperty(`value`))

  public open fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

  public open fun networkConfig(`value`: IResolvable) {
    unwrap(this).setNetworkConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun networkConfig(`value`: NetworkConfigProperty) {
    unwrap(this).setNetworkConfig(`value`.let(NetworkConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bb32d8a81827813afbc82d09d46dedbb5de56235c463ec6ff93781432c662f4b")
  public open fun networkConfig(`value`: NetworkConfigProperty.Builder.() -> Unit): Unit =
      networkConfig(NetworkConfigProperty(`value`))

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

  public open fun stoppingCondition(`value`: IResolvable) {
    unwrap(this).setStoppingCondition(`value`.let(IResolvable::unwrap))
  }

  public open fun stoppingCondition(`value`: StoppingConditionProperty) {
    unwrap(this).setStoppingCondition(`value`.let(StoppingConditionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a30ec6b6330354bcd20ed2332299ecfb4716f02b825a27a36293efdfd6868b98")
  public open fun stoppingCondition(`value`: StoppingConditionProperty.Builder.() -> Unit): Unit =
      stoppingCondition(StoppingConditionProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun dataQualityAppSpecification(dataQualityAppSpecification: IResolvable)

    public
        fun dataQualityAppSpecification(dataQualityAppSpecification: DataQualityAppSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7c3cc7666840e6f660f1c2aa438d1aa798752419d990b95e76d7b1a622889b2")
    public
        fun dataQualityAppSpecification(dataQualityAppSpecification: DataQualityAppSpecificationProperty.Builder.() -> Unit)

    public fun dataQualityBaselineConfig(dataQualityBaselineConfig: IResolvable)

    public
        fun dataQualityBaselineConfig(dataQualityBaselineConfig: DataQualityBaselineConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3581dc21eacb1f01b9748968a8bb3964711b17b8ae050d30882ce1142e72da2")
    public
        fun dataQualityBaselineConfig(dataQualityBaselineConfig: DataQualityBaselineConfigProperty.Builder.() -> Unit)

    public fun dataQualityJobInput(dataQualityJobInput: IResolvable)

    public fun dataQualityJobInput(dataQualityJobInput: DataQualityJobInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ea3a357b521a7bf511b87f9911349cb922f6c294dbc98c7832f6719dd368580")
    public
        fun dataQualityJobInput(dataQualityJobInput: DataQualityJobInputProperty.Builder.() -> Unit)

    public fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: IResolvable)

    public
        fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: MonitoringOutputConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc063ddb0a8110b538e552a21e246add2e657dd1133c4b9be123774f4c31e8d2")
    public
        fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit)

    public fun endpointName(endpointName: String)

    public fun jobDefinitionName(jobDefinitionName: String)

    public fun jobResources(jobResources: IResolvable)

    public fun jobResources(jobResources: MonitoringResourcesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a44f64ae8a014dcd00f229cc9e89cdcf108f46c2d05027bb509e1bc16192381a")
    public fun jobResources(jobResources: MonitoringResourcesProperty.Builder.() -> Unit)

    public fun networkConfig(networkConfig: IResolvable)

    public fun networkConfig(networkConfig: NetworkConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60d3b6cbd9692599af654930eef7aedade33241275cd17868a8ae50699cfbf20")
    public fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun stoppingCondition(stoppingCondition: IResolvable)

    public fun stoppingCondition(stoppingCondition: StoppingConditionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7bcc03bab27ef7e00e97905cdbf4bdbde1b91935adbed4337c1d9a1edaf483b")
    public fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.Builder =
        software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.Builder.create(scope,
        id)

    override fun dataQualityAppSpecification(dataQualityAppSpecification: IResolvable) {
      cdkBuilder.dataQualityAppSpecification(dataQualityAppSpecification.let(IResolvable::unwrap))
    }

    override
        fun dataQualityAppSpecification(dataQualityAppSpecification: DataQualityAppSpecificationProperty) {
      cdkBuilder.dataQualityAppSpecification(dataQualityAppSpecification.let(DataQualityAppSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7c3cc7666840e6f660f1c2aa438d1aa798752419d990b95e76d7b1a622889b2")
    override
        fun dataQualityAppSpecification(dataQualityAppSpecification: DataQualityAppSpecificationProperty.Builder.() -> Unit):
        Unit =
        dataQualityAppSpecification(DataQualityAppSpecificationProperty(dataQualityAppSpecification))

    override fun dataQualityBaselineConfig(dataQualityBaselineConfig: IResolvable) {
      cdkBuilder.dataQualityBaselineConfig(dataQualityBaselineConfig.let(IResolvable::unwrap))
    }

    override
        fun dataQualityBaselineConfig(dataQualityBaselineConfig: DataQualityBaselineConfigProperty) {
      cdkBuilder.dataQualityBaselineConfig(dataQualityBaselineConfig.let(DataQualityBaselineConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3581dc21eacb1f01b9748968a8bb3964711b17b8ae050d30882ce1142e72da2")
    override
        fun dataQualityBaselineConfig(dataQualityBaselineConfig: DataQualityBaselineConfigProperty.Builder.() -> Unit):
        Unit =
        dataQualityBaselineConfig(DataQualityBaselineConfigProperty(dataQualityBaselineConfig))

    override fun dataQualityJobInput(dataQualityJobInput: IResolvable) {
      cdkBuilder.dataQualityJobInput(dataQualityJobInput.let(IResolvable::unwrap))
    }

    override fun dataQualityJobInput(dataQualityJobInput: DataQualityJobInputProperty) {
      cdkBuilder.dataQualityJobInput(dataQualityJobInput.let(DataQualityJobInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ea3a357b521a7bf511b87f9911349cb922f6c294dbc98c7832f6719dd368580")
    override
        fun dataQualityJobInput(dataQualityJobInput: DataQualityJobInputProperty.Builder.() -> Unit):
        Unit = dataQualityJobInput(DataQualityJobInputProperty(dataQualityJobInput))

    override fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: IResolvable) {
      cdkBuilder.dataQualityJobOutputConfig(dataQualityJobOutputConfig.let(IResolvable::unwrap))
    }

    override
        fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: MonitoringOutputConfigProperty) {
      cdkBuilder.dataQualityJobOutputConfig(dataQualityJobOutputConfig.let(MonitoringOutputConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc063ddb0a8110b538e552a21e246add2e657dd1133c4b9be123774f4c31e8d2")
    override
        fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit):
        Unit =
        dataQualityJobOutputConfig(MonitoringOutputConfigProperty(dataQualityJobOutputConfig))

    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    override fun jobResources(jobResources: IResolvable) {
      cdkBuilder.jobResources(jobResources.let(IResolvable::unwrap))
    }

    override fun jobResources(jobResources: MonitoringResourcesProperty) {
      cdkBuilder.jobResources(jobResources.let(MonitoringResourcesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a44f64ae8a014dcd00f229cc9e89cdcf108f46c2d05027bb509e1bc16192381a")
    override fun jobResources(jobResources: MonitoringResourcesProperty.Builder.() -> Unit): Unit =
        jobResources(MonitoringResourcesProperty(jobResources))

    override fun networkConfig(networkConfig: IResolvable) {
      cdkBuilder.networkConfig(networkConfig.let(IResolvable::unwrap))
    }

    override fun networkConfig(networkConfig: NetworkConfigProperty) {
      cdkBuilder.networkConfig(networkConfig.let(NetworkConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60d3b6cbd9692599af654930eef7aedade33241275cd17868a8ae50699cfbf20")
    override fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit): Unit =
        networkConfig(NetworkConfigProperty(networkConfig))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun stoppingCondition(stoppingCondition: IResolvable) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(IResolvable::unwrap))
    }

    override fun stoppingCondition(stoppingCondition: StoppingConditionProperty) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(StoppingConditionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7bcc03bab27ef7e00e97905cdbf4bdbde1b91935adbed4337c1d9a1edaf483b")
    override fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit):
        Unit = stoppingCondition(StoppingConditionProperty(stoppingCondition))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataQualityJobDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataQualityJobDefinition(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition):
        CfnDataQualityJobDefinition = CfnDataQualityJobDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnDataQualityJobDefinition):
        software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition = wrapped.cdkObject
  }

  public interface MonitoringResourcesProperty {
    public fun clusterConfig(): Any

    @CdkDslMarker
    public interface Builder {
      public fun clusterConfig(clusterConfig: IResolvable)

      public fun clusterConfig(clusterConfig: ClusterConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("584520ca97027feae7d728374a2c2ab0371f3ab6eb41d4677c6f6d300d778c22")
      public fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringResourcesProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringResourcesProperty.builder()

      override fun clusterConfig(clusterConfig: IResolvable) {
        cdkBuilder.clusterConfig(clusterConfig.let(IResolvable::unwrap))
      }

      override fun clusterConfig(clusterConfig: ClusterConfigProperty) {
        cdkBuilder.clusterConfig(clusterConfig.let(ClusterConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("584520ca97027feae7d728374a2c2ab0371f3ab6eb41d4677c6f6d300d778c22")
      override fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit): Unit =
          clusterConfig(ClusterConfigProperty(clusterConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringResourcesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringResourcesProperty,
    ) : CdkObject(cdkObject), MonitoringResourcesProperty {
      override fun clusterConfig(): Any = unwrap(this).getClusterConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringResourcesProperty):
          MonitoringResourcesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringResourcesProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringResourcesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringResourcesProperty
    }
  }

  public interface S3OutputProperty {
    public fun localPath(): String

    public fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

    public fun s3Uri(): String

    @CdkDslMarker
    public interface Builder {
      public fun localPath(localPath: String)

      public fun s3UploadMode(s3UploadMode: String)

      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.S3OutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.S3OutputProperty.builder()

      override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      override fun s3UploadMode(s3UploadMode: String) {
        cdkBuilder.s3UploadMode(s3UploadMode)
      }

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.S3OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.S3OutputProperty,
    ) : CdkObject(cdkObject), S3OutputProperty {
      override fun localPath(): String = unwrap(this).getLocalPath()

      override fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.S3OutputProperty):
          S3OutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.S3OutputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.S3OutputProperty
    }
  }

  public interface VpcConfigProperty {
    public fun securityGroupIds(): List<String>

    public fun subnets(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnets(subnets: List<String>)

      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.VpcConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.VpcConfigProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.VpcConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.VpcConfigProperty
    }
  }

  public interface NetworkConfigProperty {
    public fun enableInterContainerTrafficEncryption(): Any? =
        unwrap(this).getEnableInterContainerTrafficEncryption()

    public fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

    public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

    @CdkDslMarker
    public interface Builder {
      public
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean)

      public
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable)

      public fun enableNetworkIsolation(enableNetworkIsolation: Boolean)

      public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable)

      public fun vpcConfig(vpcConfig: IResolvable)

      public fun vpcConfig(vpcConfig: VpcConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff23ac5ae546dc2dea340067792e9ce7cc28c705cf1a1091240947e750b08e91")
      public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.NetworkConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.NetworkConfigProperty.builder()

      override
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean) {
        cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption)
      }

      override
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable) {
        cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption.let(IResolvable::unwrap))
      }

      override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
      }

      override fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation.let(IResolvable::unwrap))
      }

      override fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
      }

      override fun vpcConfig(vpcConfig: VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff23ac5ae546dc2dea340067792e9ce7cc28c705cf1a1091240947e750b08e91")
      override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
          vpcConfig(VpcConfigProperty(vpcConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.NetworkConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.NetworkConfigProperty,
    ) : CdkObject(cdkObject), NetworkConfigProperty {
      override fun enableInterContainerTrafficEncryption(): Any? =
          unwrap(this).getEnableInterContainerTrafficEncryption()

      override fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

      override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.NetworkConfigProperty):
          NetworkConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.NetworkConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.NetworkConfigProperty
    }
  }

  public interface ClusterConfigProperty {
    public fun instanceCount(): Number

    public fun instanceType(): String

    public fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

    public fun volumeSizeInGb(): Number

    @CdkDslMarker
    public interface Builder {
      public fun instanceCount(instanceCount: Number)

      public fun instanceType(instanceType: String)

      public fun volumeKmsKeyId(volumeKmsKeyId: String)

      public fun volumeSizeInGb(volumeSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ClusterConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ClusterConfigProperty.builder()

      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun volumeKmsKeyId(volumeKmsKeyId: String) {
        cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
      }

      override fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ClusterConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ClusterConfigProperty,
    ) : CdkObject(cdkObject), ClusterConfigProperty {
      override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      override fun instanceType(): String = unwrap(this).getInstanceType()

      override fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

      override fun volumeSizeInGb(): Number = unwrap(this).getVolumeSizeInGb()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ClusterConfigProperty):
          ClusterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ClusterConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ClusterConfigProperty
    }
  }

  public interface ConstraintsResourceProperty {
    public fun s3Uri(): String? = unwrap(this).getS3Uri()

    @CdkDslMarker
    public interface Builder {
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ConstraintsResourceProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ConstraintsResourceProperty.builder()

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ConstraintsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ConstraintsResourceProperty,
    ) : CdkObject(cdkObject), ConstraintsResourceProperty {
      override fun s3Uri(): String? = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConstraintsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ConstraintsResourceProperty):
          ConstraintsResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConstraintsResourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ConstraintsResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ConstraintsResourceProperty
    }
  }

  public interface DataQualityBaselineConfigProperty {
    public fun baseliningJobName(): String? = unwrap(this).getBaseliningJobName()

    public fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()

    public fun statisticsResource(): Any? = unwrap(this).getStatisticsResource()

    @CdkDslMarker
    public interface Builder {
      public fun baseliningJobName(baseliningJobName: String)

      public fun constraintsResource(constraintsResource: IResolvable)

      public fun constraintsResource(constraintsResource: ConstraintsResourceProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e79afb48fd3493d664b77292082f7c490720341aacecd9b218ea5d1133266d0")
      public
          fun constraintsResource(constraintsResource: ConstraintsResourceProperty.Builder.() -> Unit)

      public fun statisticsResource(statisticsResource: IResolvable)

      public fun statisticsResource(statisticsResource: StatisticsResourceProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e5a43b9d6a6db0f0819a758eff0d7954a678f501531275402a372acb1d93b99")
      public
          fun statisticsResource(statisticsResource: StatisticsResourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty.builder()

      override fun baseliningJobName(baseliningJobName: String) {
        cdkBuilder.baseliningJobName(baseliningJobName)
      }

      override fun constraintsResource(constraintsResource: IResolvable) {
        cdkBuilder.constraintsResource(constraintsResource.let(IResolvable::unwrap))
      }

      override fun constraintsResource(constraintsResource: ConstraintsResourceProperty) {
        cdkBuilder.constraintsResource(constraintsResource.let(ConstraintsResourceProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e79afb48fd3493d664b77292082f7c490720341aacecd9b218ea5d1133266d0")
      override
          fun constraintsResource(constraintsResource: ConstraintsResourceProperty.Builder.() -> Unit):
          Unit = constraintsResource(ConstraintsResourceProperty(constraintsResource))

      override fun statisticsResource(statisticsResource: IResolvable) {
        cdkBuilder.statisticsResource(statisticsResource.let(IResolvable::unwrap))
      }

      override fun statisticsResource(statisticsResource: StatisticsResourceProperty) {
        cdkBuilder.statisticsResource(statisticsResource.let(StatisticsResourceProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e5a43b9d6a6db0f0819a758eff0d7954a678f501531275402a372acb1d93b99")
      override
          fun statisticsResource(statisticsResource: StatisticsResourceProperty.Builder.() -> Unit):
          Unit = statisticsResource(StatisticsResourceProperty(statisticsResource))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty,
    ) : CdkObject(cdkObject), DataQualityBaselineConfigProperty {
      override fun baseliningJobName(): String? = unwrap(this).getBaseliningJobName()

      override fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()

      override fun statisticsResource(): Any? = unwrap(this).getStatisticsResource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataQualityBaselineConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty):
          DataQualityBaselineConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataQualityBaselineConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty
    }
  }

  public interface CsvProperty {
    public fun `header`(): Any? = unwrap(this).getHeader()

    @CdkDslMarker
    public interface Builder {
      public fun `header`(`header`: Boolean)

      public fun `header`(`header`: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.CsvProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.CsvProperty.builder()

      override fun `header`(`header`: Boolean) {
        cdkBuilder.`header`(`header`)
      }

      override fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.CsvProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.CsvProperty,
    ) : CdkObject(cdkObject), CsvProperty {
      override fun `header`(): Any? = unwrap(this).getHeader()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CsvProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.CsvProperty):
          CsvProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.CsvProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.CsvProperty
    }
  }

  public interface EndpointInputProperty {
    public fun endpointName(): String

    public fun excludeFeaturesAttribute(): String? = unwrap(this).getExcludeFeaturesAttribute()

    public fun localPath(): String

    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

    @CdkDslMarker
    public interface Builder {
      public fun endpointName(endpointName: String)

      public fun excludeFeaturesAttribute(excludeFeaturesAttribute: String)

      public fun localPath(localPath: String)

      public fun s3DataDistributionType(s3DataDistributionType: String)

      public fun s3InputMode(s3InputMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.EndpointInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.EndpointInputProperty.builder()

      override fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
      }

      override fun excludeFeaturesAttribute(excludeFeaturesAttribute: String) {
        cdkBuilder.excludeFeaturesAttribute(excludeFeaturesAttribute)
      }

      override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      override fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
      }

      override fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.EndpointInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.EndpointInputProperty,
    ) : CdkObject(cdkObject), EndpointInputProperty {
      override fun endpointName(): String = unwrap(this).getEndpointName()

      override fun excludeFeaturesAttribute(): String? = unwrap(this).getExcludeFeaturesAttribute()

      override fun localPath(): String = unwrap(this).getLocalPath()

      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      override fun s3InputMode(): String? = unwrap(this).getS3InputMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.EndpointInputProperty):
          EndpointInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.EndpointInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.EndpointInputProperty
    }
  }

  public interface DatasetFormatProperty {
    public fun csv(): Any? = unwrap(this).getCsv()

    public fun json(): Any? = unwrap(this).getJson()

    public fun parquet(): Any? = unwrap(this).getParquet()

    @CdkDslMarker
    public interface Builder {
      public fun csv(csv: IResolvable)

      public fun csv(csv: CsvProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab9557e2ad5f52d198e541fa83d583ea359ee3e58ad5c365b99210e184d7fd86")
      public fun csv(csv: CsvProperty.Builder.() -> Unit)

      public fun json(json: IResolvable)

      public fun json(json: JsonProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cac9bcd127f4e80698cfcc14f303837eae664ae3840bafa961faefcfc8c2039")
      public fun json(json: JsonProperty.Builder.() -> Unit)

      public fun parquet(parquet: Boolean)

      public fun parquet(parquet: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DatasetFormatProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DatasetFormatProperty.builder()

      override fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv.let(IResolvable::unwrap))
      }

      override fun csv(csv: CsvProperty) {
        cdkBuilder.csv(csv.let(CsvProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab9557e2ad5f52d198e541fa83d583ea359ee3e58ad5c365b99210e184d7fd86")
      override fun csv(csv: CsvProperty.Builder.() -> Unit): Unit = csv(CsvProperty(csv))

      override fun json(json: IResolvable) {
        cdkBuilder.json(json.let(IResolvable::unwrap))
      }

      override fun json(json: JsonProperty) {
        cdkBuilder.json(json.let(JsonProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cac9bcd127f4e80698cfcc14f303837eae664ae3840bafa961faefcfc8c2039")
      override fun json(json: JsonProperty.Builder.() -> Unit): Unit = json(JsonProperty(json))

      override fun parquet(parquet: Boolean) {
        cdkBuilder.parquet(parquet)
      }

      override fun parquet(parquet: IResolvable) {
        cdkBuilder.parquet(parquet.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DatasetFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DatasetFormatProperty,
    ) : CdkObject(cdkObject), DatasetFormatProperty {
      override fun csv(): Any? = unwrap(this).getCsv()

      override fun json(): Any? = unwrap(this).getJson()

      override fun parquet(): Any? = unwrap(this).getParquet()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DatasetFormatProperty):
          DatasetFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetFormatProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DatasetFormatProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DatasetFormatProperty
    }
  }

  public interface StoppingConditionProperty {
    public fun maxRuntimeInSeconds(): Number

    @CdkDslMarker
    public interface Builder {
      public fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StoppingConditionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StoppingConditionProperty.builder()

      override fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number) {
        cdkBuilder.maxRuntimeInSeconds(maxRuntimeInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StoppingConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StoppingConditionProperty,
    ) : CdkObject(cdkObject), StoppingConditionProperty {
      override fun maxRuntimeInSeconds(): Number = unwrap(this).getMaxRuntimeInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StoppingConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StoppingConditionProperty):
          StoppingConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StoppingConditionProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StoppingConditionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StoppingConditionProperty
    }
  }

  public interface MonitoringOutputProperty {
    public fun s3Output(): Any

    @CdkDslMarker
    public interface Builder {
      public fun s3Output(s3Output: IResolvable)

      public fun s3Output(s3Output: S3OutputProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f964c9377277837453c38b978c960a05c92358659812f3dab50753059e4b225")
      public fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputProperty.builder()

      override fun s3Output(s3Output: IResolvable) {
        cdkBuilder.s3Output(s3Output.let(IResolvable::unwrap))
      }

      override fun s3Output(s3Output: S3OutputProperty) {
        cdkBuilder.s3Output(s3Output.let(S3OutputProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f964c9377277837453c38b978c960a05c92358659812f3dab50753059e4b225")
      override fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit): Unit =
          s3Output(S3OutputProperty(s3Output))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputProperty,
    ) : CdkObject(cdkObject), MonitoringOutputProperty {
      override fun s3Output(): Any = unwrap(this).getS3Output()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputProperty):
          MonitoringOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputProperty
    }
  }

  public interface StatisticsResourceProperty {
    public fun s3Uri(): String? = unwrap(this).getS3Uri()

    @CdkDslMarker
    public interface Builder {
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StatisticsResourceProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StatisticsResourceProperty.builder()

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StatisticsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StatisticsResourceProperty,
    ) : CdkObject(cdkObject), StatisticsResourceProperty {
      override fun s3Uri(): String? = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StatisticsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StatisticsResourceProperty):
          StatisticsResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatisticsResourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StatisticsResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StatisticsResourceProperty
    }
  }

  public interface DataQualityJobInputProperty {
    public fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

    public fun endpointInput(): Any? = unwrap(this).getEndpointInput()

    @CdkDslMarker
    public interface Builder {
      public fun batchTransformInput(batchTransformInput: IResolvable)

      public fun batchTransformInput(batchTransformInput: BatchTransformInputProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3642f77c3f54969eae23fc63f9983348466edb672f2bd9f91fa3ee3fdb501c19")
      public
          fun batchTransformInput(batchTransformInput: BatchTransformInputProperty.Builder.() -> Unit)

      public fun endpointInput(endpointInput: IResolvable)

      public fun endpointInput(endpointInput: EndpointInputProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82a9aa6a672a0da9e3735cf7c1759074ef025bf16c573eed9f2645c6992c67cb")
      public fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityJobInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityJobInputProperty.builder()

      override fun batchTransformInput(batchTransformInput: IResolvable) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(IResolvable::unwrap))
      }

      override fun batchTransformInput(batchTransformInput: BatchTransformInputProperty) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(BatchTransformInputProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3642f77c3f54969eae23fc63f9983348466edb672f2bd9f91fa3ee3fdb501c19")
      override
          fun batchTransformInput(batchTransformInput: BatchTransformInputProperty.Builder.() -> Unit):
          Unit = batchTransformInput(BatchTransformInputProperty(batchTransformInput))

      override fun endpointInput(endpointInput: IResolvable) {
        cdkBuilder.endpointInput(endpointInput.let(IResolvable::unwrap))
      }

      override fun endpointInput(endpointInput: EndpointInputProperty) {
        cdkBuilder.endpointInput(endpointInput.let(EndpointInputProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82a9aa6a672a0da9e3735cf7c1759074ef025bf16c573eed9f2645c6992c67cb")
      override fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit): Unit =
          endpointInput(EndpointInputProperty(endpointInput))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityJobInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityJobInputProperty,
    ) : CdkObject(cdkObject), DataQualityJobInputProperty {
      override fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

      override fun endpointInput(): Any? = unwrap(this).getEndpointInput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataQualityJobInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityJobInputProperty):
          DataQualityJobInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataQualityJobInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityJobInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityJobInputProperty
    }
  }

  public interface JsonProperty {
    public fun line(): Any? = unwrap(this).getLine()

    @CdkDslMarker
    public interface Builder {
      public fun line(line: Boolean)

      public fun line(line: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.JsonProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.JsonProperty.builder()

      override fun line(line: Boolean) {
        cdkBuilder.line(line)
      }

      override fun line(line: IResolvable) {
        cdkBuilder.line(line.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.JsonProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.JsonProperty,
    ) : CdkObject(cdkObject), JsonProperty {
      override fun line(): Any? = unwrap(this).getLine()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JsonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.JsonProperty):
          JsonProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.JsonProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.JsonProperty
    }
  }

  public interface BatchTransformInputProperty {
    public fun dataCapturedDestinationS3Uri(): String

    public fun datasetFormat(): Any

    public fun excludeFeaturesAttribute(): String? = unwrap(this).getExcludeFeaturesAttribute()

    public fun localPath(): String

    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

    @CdkDslMarker
    public interface Builder {
      public fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String)

      public fun datasetFormat(datasetFormat: IResolvable)

      public fun datasetFormat(datasetFormat: DatasetFormatProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4be34fde8c5ff83778321d0e3b694ffe98a4c56055eb9eefe21f99e257e8aa0")
      public fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit)

      public fun excludeFeaturesAttribute(excludeFeaturesAttribute: String)

      public fun localPath(localPath: String)

      public fun s3DataDistributionType(s3DataDistributionType: String)

      public fun s3InputMode(s3InputMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.BatchTransformInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.BatchTransformInputProperty.builder()

      override fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String) {
        cdkBuilder.dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri)
      }

      override fun datasetFormat(datasetFormat: IResolvable) {
        cdkBuilder.datasetFormat(datasetFormat.let(IResolvable::unwrap))
      }

      override fun datasetFormat(datasetFormat: DatasetFormatProperty) {
        cdkBuilder.datasetFormat(datasetFormat.let(DatasetFormatProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4be34fde8c5ff83778321d0e3b694ffe98a4c56055eb9eefe21f99e257e8aa0")
      override fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit): Unit =
          datasetFormat(DatasetFormatProperty(datasetFormat))

      override fun excludeFeaturesAttribute(excludeFeaturesAttribute: String) {
        cdkBuilder.excludeFeaturesAttribute(excludeFeaturesAttribute)
      }

      override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      override fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
      }

      override fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.BatchTransformInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.BatchTransformInputProperty,
    ) : CdkObject(cdkObject), BatchTransformInputProperty {
      override fun dataCapturedDestinationS3Uri(): String =
          unwrap(this).getDataCapturedDestinationS3Uri()

      override fun datasetFormat(): Any = unwrap(this).getDatasetFormat()

      override fun excludeFeaturesAttribute(): String? = unwrap(this).getExcludeFeaturesAttribute()

      override fun localPath(): String = unwrap(this).getLocalPath()

      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      override fun s3InputMode(): String? = unwrap(this).getS3InputMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchTransformInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.BatchTransformInputProperty):
          BatchTransformInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchTransformInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.BatchTransformInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.BatchTransformInputProperty
    }
  }

  public interface MonitoringOutputConfigProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun monitoringOutputs(): Any

    @CdkDslMarker
    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)

      public fun monitoringOutputs(monitoringOutputs: IResolvable)

      public fun monitoringOutputs(monitoringOutputs: List<Any>)

      public fun monitoringOutputs(vararg monitoringOutputs: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputConfigProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun monitoringOutputs(monitoringOutputs: IResolvable) {
        cdkBuilder.monitoringOutputs(monitoringOutputs.let(IResolvable::unwrap))
      }

      override fun monitoringOutputs(monitoringOutputs: List<Any>) {
        cdkBuilder.monitoringOutputs(monitoringOutputs)
      }

      override fun monitoringOutputs(vararg monitoringOutputs: Any): Unit =
          monitoringOutputs(monitoringOutputs.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputConfigProperty,
    ) : CdkObject(cdkObject), MonitoringOutputConfigProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun monitoringOutputs(): Any = unwrap(this).getMonitoringOutputs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringOutputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputConfigProperty):
          MonitoringOutputConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputConfigProperty
    }
  }

  public interface DataQualityAppSpecificationProperty {
    public fun containerArguments(): List<String> = unwrap(this).getContainerArguments() ?:
        emptyList()

    public fun containerEntrypoint(): List<String> = unwrap(this).getContainerEntrypoint() ?:
        emptyList()

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun imageUri(): String

    public fun postAnalyticsProcessorSourceUri(): String? =
        unwrap(this).getPostAnalyticsProcessorSourceUri()

    public fun recordPreprocessorSourceUri(): String? =
        unwrap(this).getRecordPreprocessorSourceUri()

    @CdkDslMarker
    public interface Builder {
      public fun containerArguments(containerArguments: List<String>)

      public fun containerArguments(vararg containerArguments: String)

      public fun containerEntrypoint(containerEntrypoint: List<String>)

      public fun containerEntrypoint(vararg containerEntrypoint: String)

      public fun environment(environment: IResolvable)

      public fun environment(environment: Map<String, String>)

      public fun imageUri(imageUri: String)

      public fun postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri: String)

      public fun recordPreprocessorSourceUri(recordPreprocessorSourceUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty.builder()

      override fun containerArguments(containerArguments: List<String>) {
        cdkBuilder.containerArguments(containerArguments)
      }

      override fun containerArguments(vararg containerArguments: String): Unit =
          containerArguments(containerArguments.toList())

      override fun containerEntrypoint(containerEntrypoint: List<String>) {
        cdkBuilder.containerEntrypoint(containerEntrypoint)
      }

      override fun containerEntrypoint(vararg containerEntrypoint: String): Unit =
          containerEntrypoint(containerEntrypoint.toList())

      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      override fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
      }

      override fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
      }

      override fun postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri: String) {
        cdkBuilder.postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri)
      }

      override fun recordPreprocessorSourceUri(recordPreprocessorSourceUri: String) {
        cdkBuilder.recordPreprocessorSourceUri(recordPreprocessorSourceUri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty,
    ) : CdkObject(cdkObject), DataQualityAppSpecificationProperty {
      override fun containerArguments(): List<String> = unwrap(this).getContainerArguments() ?:
          emptyList()

      override fun containerEntrypoint(): List<String> = unwrap(this).getContainerEntrypoint() ?:
          emptyList()

      override fun environment(): Any? = unwrap(this).getEnvironment()

      override fun imageUri(): String = unwrap(this).getImageUri()

      override fun postAnalyticsProcessorSourceUri(): String? =
          unwrap(this).getPostAnalyticsProcessorSourceUri()

      override fun recordPreprocessorSourceUri(): String? =
          unwrap(this).getRecordPreprocessorSourceUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataQualityAppSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty):
          DataQualityAppSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataQualityAppSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty
    }
  }
}