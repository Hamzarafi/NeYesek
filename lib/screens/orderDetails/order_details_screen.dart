import 'package:flutter/material.dart';

import 'components/body.dart';

class OrderDetailsScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Siparişler"),
      ),
      body: Body(),
    );
  }
}
