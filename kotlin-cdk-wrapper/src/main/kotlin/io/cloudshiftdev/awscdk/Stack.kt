@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.cloud_assembly_schema.MissingContext
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.IConstruct
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

/**
 * A root construct which represents a single CloudFormation stack.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * IBucket bucket;
 * App app = new App();
 * Stack stack = new Stack(app, "Stack");
 * Table.Builder.create(stack, "Table")
 * .partitionKey(Attribute.builder()
 * .name("id")
 * .type(AttributeType.STRING)
 * .build())
 * .importSource(ImportSourceSpecification.builder()
 * .compressionType(InputCompressionType.GZIP)
 * .inputFormat(InputFormat.csv(CsvOptions.builder()
 * .delimiter(",")
 * .headerList(List.of("id", "name"))
 * .build()))
 * .bucket(bucket)
 * .keyPrefix("prefix")
 * .build())
 * .build();
 * ```
 */
public open class Stack(
  cdkObject: software.amazon.awscdk.Stack,
) : CloudshiftdevConstructsConstruct(cdkObject),
    ITaggable {
  public constructor() : this(software.amazon.awscdk.Stack()
  )

  public constructor(scope: CloudshiftdevConstructsConstruct) :
      this(software.amazon.awscdk.Stack(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap))
  )

  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.Stack(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: StackProps,
  ) :
      this(software.amazon.awscdk.Stack(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(StackProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: StackProps.Builder.() -> Unit,
  ) : this(scope, id, StackProps(props)
  )

  /**
   * The AWS account into which this stack will be deployed.
   *
   * This value is resolved according to the following rules:
   *
   *
   * * The value provided to `env.account` when the stack is defined. This can
   * either be a concrete account (e.g. `585695031111`) or the
   * `Aws.ACCOUNT_ID` token.
   * * `Aws.ACCOUNT_ID`, which represents the CloudFormation intrinsic reference
   * `{ "Ref": "AWS::AccountId" }` encoded as a string token.
   *
   *
   * Preferably, you should use the return value as an opaque string and not
   * attempt to parse it to implement your logic. If you do, you must first
   * check that it is a concrete value an not an unresolved token. If this
   * value is an unresolved token (`Token.isUnresolved(stack.account)` returns
   * `true`), this implies that the user wishes that this stack will synthesize
   * into a **account-agnostic template**. In this case, your code should either
   * fail (throw an error, emit a synth error using `Annotations.of(construct).addError()`) or
   * implement some other region-agnostic behavior.
   */
  public open fun account(): String = unwrap(this).getAccount()

  /**
   * Add a dependency between this stack and another stack.
   *
   * This can be used to define dependencies between any two stacks within an
   * app, and also supports nested stacks.
   *
   * @param target 
   * @param reason
   */
  public open fun addDependency(target: Stack) {
    unwrap(this).addDependency(target.let(Stack.Companion::unwrap))
  }

  /**
   * Add a dependency between this stack and another stack.
   *
   * This can be used to define dependencies between any two stacks within an
   * app, and also supports nested stacks.
   *
   * @param target 
   * @param reason
   */
  public open fun addDependency(target: Stack, reason: String) {
    unwrap(this).addDependency(target.let(Stack.Companion::unwrap), reason)
  }

  /**
   * Adds an arbitrary key-value pair, with information you want to record about the stack.
   *
   * These get translated to the Metadata section of the generated template.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/metadata-section-structure.html)
   * @param key 
   * @param value 
   */
  public open fun addMetadata(key: String, `value`: Any) {
    unwrap(this).addMetadata(key, `value`)
  }

  /**
   * Add a Transform to this stack. A Transform is a macro that AWS CloudFormation uses to process
   * your template.
   *
   * Duplicate values are removed when stack is synthesized.
   *
   * Example:
   *
   * ```
   * Stack stack;
   * stack.addTransform("AWS::Serverless-2016-10-31");
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-section-structure.html)
   * @param transform The transform to add. 
   */
  public open fun addTransform(transform: String) {
    unwrap(this).addTransform(transform)
  }

  /**
   * The ID of the cloud assembly artifact for this stack.
   */
  public open fun artifactId(): String = unwrap(this).getArtifactId()

  /**
   * Returns the list of AZs that are available in the AWS environment (account/region) associated
   * with this stack.
   *
   * If the stack is environment-agnostic (either account and/or region are
   * tokens), this property will return an array with 2 tokens that will resolve
   * at deploy-time to the first two availability zones returned from CloudFormation's
   * `Fn::GetAZs` intrinsic function.
   *
   * If they are not available in the context, returns a set of dummy values and
   * reports them as missing, and let the CLI resolve them by calling EC2
   * `DescribeAvailabilityZones` on the target environment.
   *
   * To specify a different strategy for selecting availability zones override this method.
   */
  public open fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones()

  /**
   * Indicates whether the stack requires bundling or not.
   */
  public open fun bundlingRequired(): Boolean = unwrap(this).getBundlingRequired()

  /**
   * Return the stacks this stack depends on.
   */
  public open fun dependencies(): List<Stack> = unwrap(this).getDependencies().map(Stack::wrap)

  /**
   * The environment coordinates in which this stack is deployed.
   *
   * In the form
   * `aws://account/region`. Use `stack.account` and `stack.region` to obtain
   * the specific values, no need to parse.
   *
   * You can use this value to determine if two stacks are targeting the same
   * environment.
   *
   * If either `stack.account` or `stack.region` are not concrete values (e.g.
   * `Aws.ACCOUNT_ID` or `Aws.REGION`) the special strings `unknown-account` and/or
   * `unknown-region` will be used respectively to indicate this stack is
   * region/account-agnostic.
   */
  public open fun environment(): String = unwrap(this).getEnvironment()

  /**
   * Create a CloudFormation Export for a string list value.
   *
   * Returns a string list representing the corresponding `Fn.importValue()`
   * expression for this Export. The export expression is automatically wrapped with an
   * `Fn::Join` and the import value with an `Fn::Split`, since CloudFormation can only
   * export strings. You can control the name for the export by passing the `name` option.
   *
   * If you don't supply a value for `name`, the value you're exporting must be
   * a Resource attribute (for example: `bucket.bucketName`) and it will be
   * given the same name as the automatic cross-stack reference that would be created
   * if you used the attribute in another Stack.
   *
   * One of the uses for this method is to *remove* the relationship between
   * two Stacks established by automatic cross-stack references. It will
   * temporarily ensure that the CloudFormation Export still exists while you
   * remove the reference from the consuming stack. After that, you can remove
   * the resource and the manual export.
   *
   * See `exportValue` for an example of this process.
   *
   * @param exportedValue 
   * @param options
   */
  public open fun exportStringListValue(exportedValue: Any): List<String> =
      unwrap(this).exportStringListValue(exportedValue)

  /**
   * Create a CloudFormation Export for a string list value.
   *
   * Returns a string list representing the corresponding `Fn.importValue()`
   * expression for this Export. The export expression is automatically wrapped with an
   * `Fn::Join` and the import value with an `Fn::Split`, since CloudFormation can only
   * export strings. You can control the name for the export by passing the `name` option.
   *
   * If you don't supply a value for `name`, the value you're exporting must be
   * a Resource attribute (for example: `bucket.bucketName`) and it will be
   * given the same name as the automatic cross-stack reference that would be created
   * if you used the attribute in another Stack.
   *
   * One of the uses for this method is to *remove* the relationship between
   * two Stacks established by automatic cross-stack references. It will
   * temporarily ensure that the CloudFormation Export still exists while you
   * remove the reference from the consuming stack. After that, you can remove
   * the resource and the manual export.
   *
   * See `exportValue` for an example of this process.
   *
   * @param exportedValue 
   * @param options
   */
  public open fun exportStringListValue(exportedValue: Any, options: ExportValueOptions):
      List<String> = unwrap(this).exportStringListValue(exportedValue,
      options.let(ExportValueOptions.Companion::unwrap))

  /**
   * Create a CloudFormation Export for a string list value.
   *
   * Returns a string list representing the corresponding `Fn.importValue()`
   * expression for this Export. The export expression is automatically wrapped with an
   * `Fn::Join` and the import value with an `Fn::Split`, since CloudFormation can only
   * export strings. You can control the name for the export by passing the `name` option.
   *
   * If you don't supply a value for `name`, the value you're exporting must be
   * a Resource attribute (for example: `bucket.bucketName`) and it will be
   * given the same name as the automatic cross-stack reference that would be created
   * if you used the attribute in another Stack.
   *
   * One of the uses for this method is to *remove* the relationship between
   * two Stacks established by automatic cross-stack references. It will
   * temporarily ensure that the CloudFormation Export still exists while you
   * remove the reference from the consuming stack. After that, you can remove
   * the resource and the manual export.
   *
   * See `exportValue` for an example of this process.
   *
   * @param exportedValue 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c97ef011f5520b889c1c1e0226ad73cc2af75d212f5dd7ed23287f54f3df3eca")
  public open fun exportStringListValue(exportedValue: Any,
      options: ExportValueOptions.Builder.() -> Unit): List<String> =
      exportStringListValue(exportedValue, ExportValueOptions(options))

  /**
   * Create a CloudFormation Export for a string value.
   *
   * Returns a string representing the corresponding `Fn.importValue()`
   * expression for this Export. You can control the name for the export by
   * passing the `name` option.
   *
   * If you don't supply a value for `name`, the value you're exporting must be
   * a Resource attribute (for example: `bucket.bucketName`) and it will be
   * given the same name as the automatic cross-stack reference that would be created
   * if you used the attribute in another Stack.
   *
   * One of the uses for this method is to *remove* the relationship between
   * two Stacks established by automatic cross-stack references. It will
   * temporarily ensure that the CloudFormation Export still exists while you
   * remove the reference from the consuming stack. After that, you can remove
   * the resource and the manual export.
   *
   * Here is how the process works. Let's say there are two stacks,
   * `producerStack` and `consumerStack`, and `producerStack` has a bucket
   * called `bucket`, which is referenced by `consumerStack` (perhaps because
   * an AWS Lambda Function writes into it, or something like that).
   *
   * It is not safe to remove `producerStack.bucket` because as the bucket is being
   * deleted, `consumerStack` might still be using it.
   *
   * Instead, the process takes two deployments:
   *
   * **Deployment 1: break the relationship**:
   *
   * * Make sure `consumerStack` no longer references `bucket.bucketName` (maybe the consumer
   * stack now uses its own bucket, or it writes to an AWS DynamoDB table, or maybe you just
   * remove the Lambda Function altogether).
   * * In the `ProducerStack` class, call `this.exportValue(this.bucket.bucketName)`. This
   * will make sure the CloudFormation Export continues to exist while the relationship
   * between the two stacks is being broken.
   * * Deploy (this will effectively only change the `consumerStack`, but it's safe to deploy both).
   *
   * **Deployment 2: remove the bucket resource**:
   *
   * * You are now free to remove the `bucket` resource from `producerStack`.
   * * Don't forget to remove the `exportValue()` call as well.
   * * Deploy again (this time only the `producerStack` will be changed -- the bucket will be
   * deleted).
   *
   * @param exportedValue 
   * @param options
   */
  public open fun exportValue(exportedValue: Any): String = unwrap(this).exportValue(exportedValue)

  /**
   * Create a CloudFormation Export for a string value.
   *
   * Returns a string representing the corresponding `Fn.importValue()`
   * expression for this Export. You can control the name for the export by
   * passing the `name` option.
   *
   * If you don't supply a value for `name`, the value you're exporting must be
   * a Resource attribute (for example: `bucket.bucketName`) and it will be
   * given the same name as the automatic cross-stack reference that would be created
   * if you used the attribute in another Stack.
   *
   * One of the uses for this method is to *remove* the relationship between
   * two Stacks established by automatic cross-stack references. It will
   * temporarily ensure that the CloudFormation Export still exists while you
   * remove the reference from the consuming stack. After that, you can remove
   * the resource and the manual export.
   *
   * Here is how the process works. Let's say there are two stacks,
   * `producerStack` and `consumerStack`, and `producerStack` has a bucket
   * called `bucket`, which is referenced by `consumerStack` (perhaps because
   * an AWS Lambda Function writes into it, or something like that).
   *
   * It is not safe to remove `producerStack.bucket` because as the bucket is being
   * deleted, `consumerStack` might still be using it.
   *
   * Instead, the process takes two deployments:
   *
   * **Deployment 1: break the relationship**:
   *
   * * Make sure `consumerStack` no longer references `bucket.bucketName` (maybe the consumer
   * stack now uses its own bucket, or it writes to an AWS DynamoDB table, or maybe you just
   * remove the Lambda Function altogether).
   * * In the `ProducerStack` class, call `this.exportValue(this.bucket.bucketName)`. This
   * will make sure the CloudFormation Export continues to exist while the relationship
   * between the two stacks is being broken.
   * * Deploy (this will effectively only change the `consumerStack`, but it's safe to deploy both).
   *
   * **Deployment 2: remove the bucket resource**:
   *
   * * You are now free to remove the `bucket` resource from `producerStack`.
   * * Don't forget to remove the `exportValue()` call as well.
   * * Deploy again (this time only the `producerStack` will be changed -- the bucket will be
   * deleted).
   *
   * @param exportedValue 
   * @param options
   */
  public open fun exportValue(exportedValue: Any, options: ExportValueOptions): String =
      unwrap(this).exportValue(exportedValue, options.let(ExportValueOptions.Companion::unwrap))

  /**
   * Create a CloudFormation Export for a string value.
   *
   * Returns a string representing the corresponding `Fn.importValue()`
   * expression for this Export. You can control the name for the export by
   * passing the `name` option.
   *
   * If you don't supply a value for `name`, the value you're exporting must be
   * a Resource attribute (for example: `bucket.bucketName`) and it will be
   * given the same name as the automatic cross-stack reference that would be created
   * if you used the attribute in another Stack.
   *
   * One of the uses for this method is to *remove* the relationship between
   * two Stacks established by automatic cross-stack references. It will
   * temporarily ensure that the CloudFormation Export still exists while you
   * remove the reference from the consuming stack. After that, you can remove
   * the resource and the manual export.
   *
   * Here is how the process works. Let's say there are two stacks,
   * `producerStack` and `consumerStack`, and `producerStack` has a bucket
   * called `bucket`, which is referenced by `consumerStack` (perhaps because
   * an AWS Lambda Function writes into it, or something like that).
   *
   * It is not safe to remove `producerStack.bucket` because as the bucket is being
   * deleted, `consumerStack` might still be using it.
   *
   * Instead, the process takes two deployments:
   *
   * **Deployment 1: break the relationship**:
   *
   * * Make sure `consumerStack` no longer references `bucket.bucketName` (maybe the consumer
   * stack now uses its own bucket, or it writes to an AWS DynamoDB table, or maybe you just
   * remove the Lambda Function altogether).
   * * In the `ProducerStack` class, call `this.exportValue(this.bucket.bucketName)`. This
   * will make sure the CloudFormation Export continues to exist while the relationship
   * between the two stacks is being broken.
   * * Deploy (this will effectively only change the `consumerStack`, but it's safe to deploy both).
   *
   * **Deployment 2: remove the bucket resource**:
   *
   * * You are now free to remove the `bucket` resource from `producerStack`.
   * * Don't forget to remove the `exportValue()` call as well.
   * * Deploy again (this time only the `producerStack` will be changed -- the bucket will be
   * deleted).
   *
   * @param exportedValue 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("287d905a2cea921ded498a14ea31fc550739c7e59b46afb76bf782ac039ec978")
  public open fun exportValue(exportedValue: Any, options: ExportValueOptions.Builder.() -> Unit):
      String = exportValue(exportedValue, ExportValueOptions(options))

  /**
   * Creates an ARN from components.
   *
   * If `partition`, `region` or `account` are not specified, the stack's
   * partition, region and account will be used.
   *
   * If any component is the empty string, an empty string will be inserted
   * into the generated ARN at the location that component corresponds to.
   *
   * The ARN will be formatted as follows:
   *
   * arn:{partition}:{service}:{region}:{account}:{resource}{sep}{resource-name}
   *
   * The required ARN pieces that are omitted will be taken from the stack that
   * the 'scope' is attached to. If all ARN pieces are supplied, the supplied scope
   * can be 'undefined'.
   *
   * @param components 
   */
  public open fun formatArn(components: ArnComponents): String =
      unwrap(this).formatArn(components.let(ArnComponents.Companion::unwrap))

  /**
   * Creates an ARN from components.
   *
   * If `partition`, `region` or `account` are not specified, the stack's
   * partition, region and account will be used.
   *
   * If any component is the empty string, an empty string will be inserted
   * into the generated ARN at the location that component corresponds to.
   *
   * The ARN will be formatted as follows:
   *
   * arn:{partition}:{service}:{region}:{account}:{resource}{sep}{resource-name}
   *
   * The required ARN pieces that are omitted will be taken from the stack that
   * the 'scope' is attached to. If all ARN pieces are supplied, the supplied scope
   * can be 'undefined'.
   *
   * @param components 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5cb6ca9b4bf3e2cc29fe8b2c2a3330e4c5b57e53dcb25f4a8efdbca2514bf6b9")
  public open fun formatArn(components: ArnComponents.Builder.() -> Unit): String =
      formatArn(ArnComponents(components))

  /**
   * Allocates a stack-unique CloudFormation-compatible logical identity for a specific resource.
   *
   * This method is called when a `CfnElement` is created and used to render the
   * initial logical identity of resources. Logical ID renames are applied at
   * this stage.
   *
   * This method uses the protected method `allocateLogicalId` to render the
   * logical ID for an element. To modify the naming scheme, extend the `Stack`
   * class and override this method.
   *
   * @param element The CloudFormation element for which a logical identity is needed. 
   */
  public open fun logicalId(element: CfnElement): String =
      unwrap(this).getLogicalId(element.let(CfnElement.Companion::unwrap))

  /**
   * Indicates if this is a nested stack, in which case `parentStack` will include a reference to
   * it's parent.
   */
  public open fun nested(): Boolean = unwrap(this).getNested()

  /**
   * If this is a nested stack, returns it's parent stack.
   */
  public open fun nestedStackParent(): Stack? =
      unwrap(this).getNestedStackParent()?.let(Stack::wrap)

  /**
   * If this is a nested stack, this represents its `AWS::CloudFormation::Stack` resource.
   *
   * `undefined` for top-level (non-nested) stacks.
   */
  public open fun nestedStackResource(): CfnResource? =
      unwrap(this).getNestedStackResource()?.let(CfnResource::wrap)

  /**
   * Returns the list of notification Amazon Resource Names (ARNs) for the current stack.
   */
  public open fun notificationArns(): List<String> = unwrap(this).getNotificationArns()

  /**
   * The partition in which this stack is defined.
   */
  public open fun partition(): String = unwrap(this).getPartition()

  /**
   * The AWS region into which this stack will be deployed (e.g. `us-west-2`).
   *
   * This value is resolved according to the following rules:
   *
   *
   * * The value provided to `env.region` when the stack is defined. This can
   * either be a concrete region (e.g. `us-west-2`) or the `Aws.REGION`
   * token.
   * * `Aws.REGION`, which is represents the CloudFormation intrinsic reference
   * `{ "Ref": "AWS::Region" }` encoded as a string token.
   *
   *
   * Preferably, you should use the return value as an opaque string and not
   * attempt to parse it to implement your logic. If you do, you must first
   * check that it is a concrete value an not an unresolved token. If this
   * value is an unresolved token (`Token.isUnresolved(stack.region)` returns
   * `true`), this implies that the user wishes that this stack will synthesize
   * into a **region-agnostic template**. In this case, your code should either
   * fail (throw an error, emit a synth error using `Annotations.of(construct).addError()`) or
   * implement some other region-agnostic behavior.
   */
  public open fun region(): String = unwrap(this).getRegion()

  /**
   * Look up a fact value for the given fact for the region of this stack.
   *
   * Will return a definite value only if the region of the current stack is resolved.
   * If not, a lookup map will be added to the stack and the lookup will be done at
   * CDK deployment time.
   *
   * What regions will be included in the lookup map is controlled by the
   * `&#64;aws-cdk/core:target-partitions` context value: it must be set to a list
   * of partitions, and only regions from the given partitions will be included.
   * If no such context key is set, all regions will be included.
   *
   * This function is intended to be used by construct library authors. Application
   * builders can rely on the abstractions offered by construct libraries and do
   * not have to worry about regional facts.
   *
   * If `defaultValue` is not given, it is an error if the fact is unknown for
   * the given region.
   *
   * @param factName 
   * @param defaultValue
   */
  public open fun regionalFact(factName: String): String = unwrap(this).regionalFact(factName)

  /**
   * Look up a fact value for the given fact for the region of this stack.
   *
   * Will return a definite value only if the region of the current stack is resolved.
   * If not, a lookup map will be added to the stack and the lookup will be done at
   * CDK deployment time.
   *
   * What regions will be included in the lookup map is controlled by the
   * `&#64;aws-cdk/core:target-partitions` context value: it must be set to a list
   * of partitions, and only regions from the given partitions will be included.
   * If no such context key is set, all regions will be included.
   *
   * This function is intended to be used by construct library authors. Application
   * builders can rely on the abstractions offered by construct libraries and do
   * not have to worry about regional facts.
   *
   * If `defaultValue` is not given, it is an error if the fact is unknown for
   * the given region.
   *
   * @param factName 
   * @param defaultValue
   */
  public open fun regionalFact(factName: String, defaultValue: String): String =
      unwrap(this).regionalFact(factName, defaultValue)

  /**
   * Rename a generated logical identities.
   *
   * To modify the naming scheme strategy, extend the `Stack` class and
   * override the `allocateLogicalId` method.
   *
   * @param oldId 
   * @param newId 
   */
  public open fun renameLogicalId(oldId: String, newId: String) {
    unwrap(this).renameLogicalId(oldId, newId)
  }

  /**
   * Indicate that a context key was expected.
   *
   * Contains instructions which will be emitted into the cloud assembly on how
   * the key should be supplied.
   *
   * @param report The set of parameters needed to obtain the context. 
   */
  public open fun reportMissingContextKey(report: MissingContext) {
    unwrap(this).reportMissingContextKey(report.let(MissingContext.Companion::unwrap))
  }

  /**
   * Indicate that a context key was expected.
   *
   * Contains instructions which will be emitted into the cloud assembly on how
   * the key should be supplied.
   *
   * @param report The set of parameters needed to obtain the context. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("518cf0a47062d88d22e5197a66e79669873dbac9d6294bf52ac8b693bf65e8b4")
  public open fun reportMissingContextKey(report: MissingContext.Builder.() -> Unit): Unit =
      reportMissingContextKey(MissingContext(report))

  /**
   * Resolve a tokenized value in the context of the current stack.
   *
   * @param obj 
   */
  public open fun resolve(obj: Any): Any = unwrap(this).resolve(obj)

  /**
   * Splits the provided ARN into its components.
   *
   * Works both if 'arn' is a string like 'arn:aws:s3:::bucket',
   * and a Token representing a dynamic CloudFormation expression
   * (in which case the returned components will also be dynamic CloudFormation expressions,
   * encoded as Tokens).
   *
   * @param arn the ARN to split into its components. 
   * @param arnFormat the expected format of 'arn' - depends on what format the service 'arn'
   * represents uses. 
   */
  public open fun splitArn(arn: String, arnFormat: ArnFormat): ArnComponents =
      unwrap(this).splitArn(arn,
      arnFormat.let(ArnFormat.Companion::unwrap)).let(ArnComponents::wrap)

  /**
   * The ID of the stack.
   *
   * Example:
   *
   * ```
   * // After resolving, looks like
   * "arn:aws:cloudformation:us-west-2:123456789012:stack/teststack/51af3dc0-da77-11e4-872e-1234567db123";
   * ```
   */
  public open fun stackId(): String = unwrap(this).getStackId()

  /**
   * The concrete CloudFormation physical stack name.
   *
   * This is either the name defined explicitly in the `stackName` prop or
   * allocated based on the stack's location in the construct tree. Stacks that
   * are directly defined under the app use their construct `id` as their stack
   * name. Stacks that are defined deeper within the tree will use a hashed naming
   * scheme based on the construct path to ensure uniqueness.
   *
   * If you wish to obtain the deploy-time AWS::StackName intrinsic,
   * you can use `Aws.STACK_NAME` directly.
   */
  public open fun stackName(): String = unwrap(this).getStackName()

  /**
   * Synthesis method for this stack.
   */
  public open fun synthesizer(): IStackSynthesizer =
      unwrap(this).getSynthesizer().let(IStackSynthesizer::wrap)

  /**
   * Tags to be applied to the stack.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The name of the CloudFormation template file emitted to the output directory during synthesis.
   *
   * Example value: `MyStack.template.json`
   */
  public open fun templateFile(): String = unwrap(this).getTemplateFile()

  /**
   * Options for CloudFormation template (like version, transform, description).
   */
  public open fun templateOptions(): ITemplateOptions =
      unwrap(this).getTemplateOptions().let(ITemplateOptions::wrap)

  /**
   * Whether termination protection is enabled for this stack.
   */
  public open fun terminationProtection(): Boolean = unwrap(this).getTerminationProtection()

  /**
   * Whether termination protection is enabled for this stack.
   */
  public open fun terminationProtection(`value`: Boolean) {
    unwrap(this).setTerminationProtection(`value`)
  }

  /**
   * Convert an object, potentially containing tokens, to a JSON string.
   *
   * @param obj 
   * @param space
   */
  public open fun toJsonString(obj: Any): String = unwrap(this).toJsonString(obj)

  /**
   * Convert an object, potentially containing tokens, to a JSON string.
   *
   * @param obj 
   * @param space
   */
  public open fun toJsonString(obj: Any, space: Number): String = unwrap(this).toJsonString(obj,
      space)

  /**
   * Convert an object, potentially containing tokens, to a YAML string.
   *
   * @param obj 
   */
  public open fun toYamlString(obj: Any): String = unwrap(this).toYamlString(obj)

  /**
   * The Amazon domain suffix for the region in which this stack is defined.
   */
  public open fun urlSuffix(): String = unwrap(this).getUrlSuffix()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.Stack].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Include runtime versioning information in this Stack.
     *
     * Default: `analyticsReporting` setting of containing `App`, or value of
     * 'aws:cdk:version-reporting' context key
     *
     * @param analyticsReporting Include runtime versioning information in this Stack. 
     */
    public fun analyticsReporting(analyticsReporting: Boolean)

    /**
     * Enable this flag to allow native cross region stack references.
     *
     * Enabling this will create a CloudFormation custom resource
     * in both the producing stack and consuming stack in order to perform the export/import
     *
     * This feature is currently experimental
     *
     * Default: false
     *
     * @param crossRegionReferences Enable this flag to allow native cross region stack references. 
     */
    public fun crossRegionReferences(crossRegionReferences: Boolean)

    /**
     * A description of the stack.
     *
     * Default: - No description.
     *
     * @param description A description of the stack. 
     */
    public fun description(description: String)

    /**
     * The AWS environment (account/region) where this stack will be deployed.
     *
     * Set the `region`/`account` fields of `env` to either a concrete value to
     * select the indicated environment (recommended for production stacks), or to
     * the values of environment variables
     * `CDK_DEFAULT_REGION`/`CDK_DEFAULT_ACCOUNT` to let the target environment
     * depend on the AWS credentials/configuration that the CDK CLI is executed
     * under (recommended for development stacks).
     *
     * If the `Stack` is instantiated inside a `Stage`, any undefined
     * `region`/`account` fields from `env` will default to the same field on the
     * encompassing `Stage`, if configured there.
     *
     * If either `region` or `account` are not set nor inherited from `Stage`, the
     * Stack will be considered "*environment-agnostic*"". Environment-agnostic
     * stacks can be deployed to any environment but may not be able to take
     * advantage of all features of the CDK. For example, they will not be able to
     * use environmental context lookups such as `ec2.Vpc.fromLookup` and will not
     * automatically translate Service Principals to the right format based on the
     * environment's AWS partition, and other such enhancements.
     *
     * Default: - The environment of the containing `Stage` if available,
     * otherwise create the stack will be environment-agnostic.
     *
     * Example:
     *
     * ```
     * // Use a concrete account and region to deploy this stack to:
     * // `.account` and `.region` will simply return these values.
     * // Use a concrete account and region to deploy this stack to:
     * // `.account` and `.region` will simply return these values.
     * Stack.Builder.create(app, "Stack1")
     * .env(Environment.builder()
     * .account("123456789012")
     * .region("us-east-1")
     * .build())
     * .build();
     * // Use the CLI's current credentials to determine the target environment:
     * // `.account` and `.region` will reflect the account+region the CLI
     * // is configured to use (based on the user CLI credentials)
     * // Use the CLI's current credentials to determine the target environment:
     * // `.account` and `.region` will reflect the account+region the CLI
     * // is configured to use (based on the user CLI credentials)
     * Stack.Builder.create(app, "Stack2")
     * .env(Environment.builder()
     * .account(process.getEnv().getCDK_DEFAULT_ACCOUNT())
     * .region(process.getEnv().getCDK_DEFAULT_REGION())
     * .build())
     * .build();
     * // Define multiple stacks stage associated with an environment
     * Stage myStage = Stage.Builder.create(app, "MyStage")
     * .env(Environment.builder()
     * .account("123456789012")
     * .region("us-east-1")
     * .build())
     * .build();
     * // both of these stacks will use the stage's account/region:
     * // `.account` and `.region` will resolve to the concrete values as above
     * // both of these stacks will use the stage's account/region:
     * // `.account` and `.region` will resolve to the concrete values as above
     * new MyStack(myStage, "Stack1");
     * new YourStack(myStage, "Stack2");
     * // Define an environment-agnostic stack:
     * // `.account` and `.region` will resolve to `{ "Ref": "AWS::AccountId" }` and `{ "Ref":
     * "AWS::Region" }` respectively.
     * // which will only resolve to actual values by CloudFormation during deployment.
     * // Define an environment-agnostic stack:
     * // `.account` and `.region` will resolve to `{ "Ref": "AWS::AccountId" }` and `{ "Ref":
     * "AWS::Region" }` respectively.
     * // which will only resolve to actual values by CloudFormation during deployment.
     * new MyStack(app, "Stack1");
     * ```
     *
     * @param env The AWS environment (account/region) where this stack will be deployed. 
     */
    public fun env(env: Environment)

    /**
     * The AWS environment (account/region) where this stack will be deployed.
     *
     * Set the `region`/`account` fields of `env` to either a concrete value to
     * select the indicated environment (recommended for production stacks), or to
     * the values of environment variables
     * `CDK_DEFAULT_REGION`/`CDK_DEFAULT_ACCOUNT` to let the target environment
     * depend on the AWS credentials/configuration that the CDK CLI is executed
     * under (recommended for development stacks).
     *
     * If the `Stack` is instantiated inside a `Stage`, any undefined
     * `region`/`account` fields from `env` will default to the same field on the
     * encompassing `Stage`, if configured there.
     *
     * If either `region` or `account` are not set nor inherited from `Stage`, the
     * Stack will be considered "*environment-agnostic*"". Environment-agnostic
     * stacks can be deployed to any environment but may not be able to take
     * advantage of all features of the CDK. For example, they will not be able to
     * use environmental context lookups such as `ec2.Vpc.fromLookup` and will not
     * automatically translate Service Principals to the right format based on the
     * environment's AWS partition, and other such enhancements.
     *
     * Default: - The environment of the containing `Stage` if available,
     * otherwise create the stack will be environment-agnostic.
     *
     * Example:
     *
     * ```
     * // Use a concrete account and region to deploy this stack to:
     * // `.account` and `.region` will simply return these values.
     * // Use a concrete account and region to deploy this stack to:
     * // `.account` and `.region` will simply return these values.
     * Stack.Builder.create(app, "Stack1")
     * .env(Environment.builder()
     * .account("123456789012")
     * .region("us-east-1")
     * .build())
     * .build();
     * // Use the CLI's current credentials to determine the target environment:
     * // `.account` and `.region` will reflect the account+region the CLI
     * // is configured to use (based on the user CLI credentials)
     * // Use the CLI's current credentials to determine the target environment:
     * // `.account` and `.region` will reflect the account+region the CLI
     * // is configured to use (based on the user CLI credentials)
     * Stack.Builder.create(app, "Stack2")
     * .env(Environment.builder()
     * .account(process.getEnv().getCDK_DEFAULT_ACCOUNT())
     * .region(process.getEnv().getCDK_DEFAULT_REGION())
     * .build())
     * .build();
     * // Define multiple stacks stage associated with an environment
     * Stage myStage = Stage.Builder.create(app, "MyStage")
     * .env(Environment.builder()
     * .account("123456789012")
     * .region("us-east-1")
     * .build())
     * .build();
     * // both of these stacks will use the stage's account/region:
     * // `.account` and `.region` will resolve to the concrete values as above
     * // both of these stacks will use the stage's account/region:
     * // `.account` and `.region` will resolve to the concrete values as above
     * new MyStack(myStage, "Stack1");
     * new YourStack(myStage, "Stack2");
     * // Define an environment-agnostic stack:
     * // `.account` and `.region` will resolve to `{ "Ref": "AWS::AccountId" }` and `{ "Ref":
     * "AWS::Region" }` respectively.
     * // which will only resolve to actual values by CloudFormation during deployment.
     * // Define an environment-agnostic stack:
     * // `.account` and `.region` will resolve to `{ "Ref": "AWS::AccountId" }` and `{ "Ref":
     * "AWS::Region" }` respectively.
     * // which will only resolve to actual values by CloudFormation during deployment.
     * new MyStack(app, "Stack1");
     * ```
     *
     * @param env The AWS environment (account/region) where this stack will be deployed. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("257d47dfd98ff7d3e84d09d23159057e237273e6f9d86e0e1a4729cfbd62261d")
    public fun env(env: Environment.Builder.() -> Unit)

    /**
     * SNS Topic ARNs that will receive stack events.
     *
     * Default: - no notfication arns.
     *
     * @param notificationArns SNS Topic ARNs that will receive stack events. 
     */
    public fun notificationArns(notificationArns: List<String>)

    /**
     * SNS Topic ARNs that will receive stack events.
     *
     * Default: - no notfication arns.
     *
     * @param notificationArns SNS Topic ARNs that will receive stack events. 
     */
    public fun notificationArns(vararg notificationArns: String)

    /**
     * Options for applying a permissions boundary to all IAM Roles and Users created within this
     * Stage.
     *
     * Default: - no permissions boundary is applied
     *
     * @param permissionsBoundary Options for applying a permissions boundary to all IAM Roles and
     * Users created within this Stage. 
     */
    public fun permissionsBoundary(permissionsBoundary: PermissionsBoundary)

    /**
     * Name to deploy the stack with.
     *
     * Default: - Derived from construct path.
     *
     * @param stackName Name to deploy the stack with. 
     */
    public fun stackName(stackName: String)

    /**
     * Enable this flag to suppress indentation in generated CloudFormation templates.
     *
     * If not specified, the value of the `&#64;aws-cdk/core:suppressTemplateIndentation`
     * context key will be used. If that is not specified, then the
     * default value `false` will be used.
     *
     * Default: - the value of `@aws-cdk/core:suppressTemplateIndentation`, or `false` if that is
     * not set.
     *
     * @param suppressTemplateIndentation Enable this flag to suppress indentation in generated
     * CloudFormation templates. 
     */
    public fun suppressTemplateIndentation(suppressTemplateIndentation: Boolean)

    /**
     * Synthesis method to use while deploying this stack.
     *
     * The Stack Synthesizer controls aspects of synthesis and deployment,
     * like how assets are referenced and what IAM roles to use. For more
     * information, see the README of the main CDK package.
     *
     * If not specified, the `defaultStackSynthesizer` from `App` will be used.
     * If that is not specified, `DefaultStackSynthesizer` is used if
     * `&#64;aws-cdk/core:newStyleStackSynthesis` is set to `true` or the CDK major
     * version is v2. In CDK v1 `LegacyStackSynthesizer` is the default if no
     * other synthesizer is specified.
     *
     * Default: - The synthesizer specified on `App`, or `DefaultStackSynthesizer` otherwise.
     *
     * @param synthesizer Synthesis method to use while deploying this stack. 
     */
    public fun synthesizer(synthesizer: IStackSynthesizer)

    /**
     * Stack tags that will be applied to all the taggable resources and the stack itself.
     *
     * Default: {}
     *
     * @param tags Stack tags that will be applied to all the taggable resources and the stack
     * itself. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * Whether to enable termination protection for this stack.
     *
     * Default: false
     *
     * @param terminationProtection Whether to enable termination protection for this stack. 
     */
    public fun terminationProtection(terminationProtection: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.Stack.Builder =
        software.amazon.awscdk.Stack.Builder.create(scope, id)

    /**
     * Include runtime versioning information in this Stack.
     *
     * Default: `analyticsReporting` setting of containing `App`, or value of
     * 'aws:cdk:version-reporting' context key
     *
     * @param analyticsReporting Include runtime versioning information in this Stack. 
     */
    override fun analyticsReporting(analyticsReporting: Boolean) {
      cdkBuilder.analyticsReporting(analyticsReporting)
    }

    /**
     * Enable this flag to allow native cross region stack references.
     *
     * Enabling this will create a CloudFormation custom resource
     * in both the producing stack and consuming stack in order to perform the export/import
     *
     * This feature is currently experimental
     *
     * Default: false
     *
     * @param crossRegionReferences Enable this flag to allow native cross region stack references. 
     */
    override fun crossRegionReferences(crossRegionReferences: Boolean) {
      cdkBuilder.crossRegionReferences(crossRegionReferences)
    }

    /**
     * A description of the stack.
     *
     * Default: - No description.
     *
     * @param description A description of the stack. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The AWS environment (account/region) where this stack will be deployed.
     *
     * Set the `region`/`account` fields of `env` to either a concrete value to
     * select the indicated environment (recommended for production stacks), or to
     * the values of environment variables
     * `CDK_DEFAULT_REGION`/`CDK_DEFAULT_ACCOUNT` to let the target environment
     * depend on the AWS credentials/configuration that the CDK CLI is executed
     * under (recommended for development stacks).
     *
     * If the `Stack` is instantiated inside a `Stage`, any undefined
     * `region`/`account` fields from `env` will default to the same field on the
     * encompassing `Stage`, if configured there.
     *
     * If either `region` or `account` are not set nor inherited from `Stage`, the
     * Stack will be considered "*environment-agnostic*"". Environment-agnostic
     * stacks can be deployed to any environment but may not be able to take
     * advantage of all features of the CDK. For example, they will not be able to
     * use environmental context lookups such as `ec2.Vpc.fromLookup` and will not
     * automatically translate Service Principals to the right format based on the
     * environment's AWS partition, and other such enhancements.
     *
     * Default: - The environment of the containing `Stage` if available,
     * otherwise create the stack will be environment-agnostic.
     *
     * Example:
     *
     * ```
     * // Use a concrete account and region to deploy this stack to:
     * // `.account` and `.region` will simply return these values.
     * // Use a concrete account and region to deploy this stack to:
     * // `.account` and `.region` will simply return these values.
     * Stack.Builder.create(app, "Stack1")
     * .env(Environment.builder()
     * .account("123456789012")
     * .region("us-east-1")
     * .build())
     * .build();
     * // Use the CLI's current credentials to determine the target environment:
     * // `.account` and `.region` will reflect the account+region the CLI
     * // is configured to use (based on the user CLI credentials)
     * // Use the CLI's current credentials to determine the target environment:
     * // `.account` and `.region` will reflect the account+region the CLI
     * // is configured to use (based on the user CLI credentials)
     * Stack.Builder.create(app, "Stack2")
     * .env(Environment.builder()
     * .account(process.getEnv().getCDK_DEFAULT_ACCOUNT())
     * .region(process.getEnv().getCDK_DEFAULT_REGION())
     * .build())
     * .build();
     * // Define multiple stacks stage associated with an environment
     * Stage myStage = Stage.Builder.create(app, "MyStage")
     * .env(Environment.builder()
     * .account("123456789012")
     * .region("us-east-1")
     * .build())
     * .build();
     * // both of these stacks will use the stage's account/region:
     * // `.account` and `.region` will resolve to the concrete values as above
     * // both of these stacks will use the stage's account/region:
     * // `.account` and `.region` will resolve to the concrete values as above
     * new MyStack(myStage, "Stack1");
     * new YourStack(myStage, "Stack2");
     * // Define an environment-agnostic stack:
     * // `.account` and `.region` will resolve to `{ "Ref": "AWS::AccountId" }` and `{ "Ref":
     * "AWS::Region" }` respectively.
     * // which will only resolve to actual values by CloudFormation during deployment.
     * // Define an environment-agnostic stack:
     * // `.account` and `.region` will resolve to `{ "Ref": "AWS::AccountId" }` and `{ "Ref":
     * "AWS::Region" }` respectively.
     * // which will only resolve to actual values by CloudFormation during deployment.
     * new MyStack(app, "Stack1");
     * ```
     *
     * @param env The AWS environment (account/region) where this stack will be deployed. 
     */
    override fun env(env: Environment) {
      cdkBuilder.env(env.let(Environment.Companion::unwrap))
    }

    /**
     * The AWS environment (account/region) where this stack will be deployed.
     *
     * Set the `region`/`account` fields of `env` to either a concrete value to
     * select the indicated environment (recommended for production stacks), or to
     * the values of environment variables
     * `CDK_DEFAULT_REGION`/`CDK_DEFAULT_ACCOUNT` to let the target environment
     * depend on the AWS credentials/configuration that the CDK CLI is executed
     * under (recommended for development stacks).
     *
     * If the `Stack` is instantiated inside a `Stage`, any undefined
     * `region`/`account` fields from `env` will default to the same field on the
     * encompassing `Stage`, if configured there.
     *
     * If either `region` or `account` are not set nor inherited from `Stage`, the
     * Stack will be considered "*environment-agnostic*"". Environment-agnostic
     * stacks can be deployed to any environment but may not be able to take
     * advantage of all features of the CDK. For example, they will not be able to
     * use environmental context lookups such as `ec2.Vpc.fromLookup` and will not
     * automatically translate Service Principals to the right format based on the
     * environment's AWS partition, and other such enhancements.
     *
     * Default: - The environment of the containing `Stage` if available,
     * otherwise create the stack will be environment-agnostic.
     *
     * Example:
     *
     * ```
     * // Use a concrete account and region to deploy this stack to:
     * // `.account` and `.region` will simply return these values.
     * // Use a concrete account and region to deploy this stack to:
     * // `.account` and `.region` will simply return these values.
     * Stack.Builder.create(app, "Stack1")
     * .env(Environment.builder()
     * .account("123456789012")
     * .region("us-east-1")
     * .build())
     * .build();
     * // Use the CLI's current credentials to determine the target environment:
     * // `.account` and `.region` will reflect the account+region the CLI
     * // is configured to use (based on the user CLI credentials)
     * // Use the CLI's current credentials to determine the target environment:
     * // `.account` and `.region` will reflect the account+region the CLI
     * // is configured to use (based on the user CLI credentials)
     * Stack.Builder.create(app, "Stack2")
     * .env(Environment.builder()
     * .account(process.getEnv().getCDK_DEFAULT_ACCOUNT())
     * .region(process.getEnv().getCDK_DEFAULT_REGION())
     * .build())
     * .build();
     * // Define multiple stacks stage associated with an environment
     * Stage myStage = Stage.Builder.create(app, "MyStage")
     * .env(Environment.builder()
     * .account("123456789012")
     * .region("us-east-1")
     * .build())
     * .build();
     * // both of these stacks will use the stage's account/region:
     * // `.account` and `.region` will resolve to the concrete values as above
     * // both of these stacks will use the stage's account/region:
     * // `.account` and `.region` will resolve to the concrete values as above
     * new MyStack(myStage, "Stack1");
     * new YourStack(myStage, "Stack2");
     * // Define an environment-agnostic stack:
     * // `.account` and `.region` will resolve to `{ "Ref": "AWS::AccountId" }` and `{ "Ref":
     * "AWS::Region" }` respectively.
     * // which will only resolve to actual values by CloudFormation during deployment.
     * // Define an environment-agnostic stack:
     * // `.account` and `.region` will resolve to `{ "Ref": "AWS::AccountId" }` and `{ "Ref":
     * "AWS::Region" }` respectively.
     * // which will only resolve to actual values by CloudFormation during deployment.
     * new MyStack(app, "Stack1");
     * ```
     *
     * @param env The AWS environment (account/region) where this stack will be deployed. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("257d47dfd98ff7d3e84d09d23159057e237273e6f9d86e0e1a4729cfbd62261d")
    override fun env(env: Environment.Builder.() -> Unit): Unit = env(Environment(env))

    /**
     * SNS Topic ARNs that will receive stack events.
     *
     * Default: - no notfication arns.
     *
     * @param notificationArns SNS Topic ARNs that will receive stack events. 
     */
    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    /**
     * SNS Topic ARNs that will receive stack events.
     *
     * Default: - no notfication arns.
     *
     * @param notificationArns SNS Topic ARNs that will receive stack events. 
     */
    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    /**
     * Options for applying a permissions boundary to all IAM Roles and Users created within this
     * Stage.
     *
     * Default: - no permissions boundary is applied
     *
     * @param permissionsBoundary Options for applying a permissions boundary to all IAM Roles and
     * Users created within this Stage. 
     */
    override fun permissionsBoundary(permissionsBoundary: PermissionsBoundary) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(PermissionsBoundary.Companion::unwrap))
    }

    /**
     * Name to deploy the stack with.
     *
     * Default: - Derived from construct path.
     *
     * @param stackName Name to deploy the stack with. 
     */
    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    /**
     * Enable this flag to suppress indentation in generated CloudFormation templates.
     *
     * If not specified, the value of the `&#64;aws-cdk/core:suppressTemplateIndentation`
     * context key will be used. If that is not specified, then the
     * default value `false` will be used.
     *
     * Default: - the value of `@aws-cdk/core:suppressTemplateIndentation`, or `false` if that is
     * not set.
     *
     * @param suppressTemplateIndentation Enable this flag to suppress indentation in generated
     * CloudFormation templates. 
     */
    override fun suppressTemplateIndentation(suppressTemplateIndentation: Boolean) {
      cdkBuilder.suppressTemplateIndentation(suppressTemplateIndentation)
    }

    /**
     * Synthesis method to use while deploying this stack.
     *
     * The Stack Synthesizer controls aspects of synthesis and deployment,
     * like how assets are referenced and what IAM roles to use. For more
     * information, see the README of the main CDK package.
     *
     * If not specified, the `defaultStackSynthesizer` from `App` will be used.
     * If that is not specified, `DefaultStackSynthesizer` is used if
     * `&#64;aws-cdk/core:newStyleStackSynthesis` is set to `true` or the CDK major
     * version is v2. In CDK v1 `LegacyStackSynthesizer` is the default if no
     * other synthesizer is specified.
     *
     * Default: - The synthesizer specified on `App`, or `DefaultStackSynthesizer` otherwise.
     *
     * @param synthesizer Synthesis method to use while deploying this stack. 
     */
    override fun synthesizer(synthesizer: IStackSynthesizer) {
      cdkBuilder.synthesizer(synthesizer.let(IStackSynthesizer.Companion::unwrap))
    }

    /**
     * Stack tags that will be applied to all the taggable resources and the stack itself.
     *
     * Default: {}
     *
     * @param tags Stack tags that will be applied to all the taggable resources and the stack
     * itself. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * Whether to enable termination protection for this stack.
     *
     * Default: false
     *
     * @param terminationProtection Whether to enable termination protection for this stack. 
     */
    override fun terminationProtection(terminationProtection: Boolean) {
      cdkBuilder.terminationProtection(terminationProtection)
    }

    public fun build(): software.amazon.awscdk.Stack = cdkBuilder.build()
  }

  public companion object {
    public fun isStack(x: Any): Boolean = software.amazon.awscdk.Stack.isStack(x)

    public fun of(construct: IConstruct): Stack =
        software.amazon.awscdk.Stack.of(construct.let(IConstruct.Companion::unwrap)).let(Stack::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Stack {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Stack(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.Stack): Stack = Stack(cdkObject)

    internal fun unwrap(wrapped: Stack): software.amazon.awscdk.Stack = wrapped.cdkObject as
        software.amazon.awscdk.Stack
  }
}
