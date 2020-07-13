import { registerApplication, start } from "single-spa";
import modulea from "module-a/src/index";

registerApplication({
  name: "@test/react",
  app: modulea,
  activeWhen: ["/test"],
});

start({
  urlRerouteOnly: true,
});
